#!/home/micka/anaconda3/bin/python
# coding: utf-8

from pymongo import MongoClient
from bs4 import BeautifulSoup,re
import requests

import json
import os
HOST = 'localhost'
DB = 'geipan'

mongo = MongoClient('mongodb://' + HOST)

db = mongo[DB]

cursor=db['Cas'].find({}, no_cursor_timeout=True).batch_size(20)
idCasFail = list()
for _cas in cursor:
    res = requests.get('http://www.cnes-geipan.fr/index.php?id=202&cas=' + _cas['cas_numEtude'])
    if res.status_code == 200:
        resContent = res.content
        soup = BeautifulSoup(resContent, 'html.parser')
        try:
            description = soup.find(string=re.compile("Description")).find_next("td").text
            newObject = _cas;
            _cas['cas_resume'] = description
            print(str(_cas['_id']) + ' updated')
            db['Cas'].update_one({'_id': _cas['_id']}, {'$set': newObject})
        except:
            print("description not found -> append list")
            idCasFail.append(str(_cas['_id']))
    else:
        print("request fail -> append list")
        idCasFail.append(str(_cas['_id']))
cursor.close()
print(idCasFail)
