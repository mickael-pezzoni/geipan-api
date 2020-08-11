#!/home/micka/anaconda3/bin/python
# coding: utf-8


from pymongo import MongoClient
import requests
from bs4 import BeautifulSoup,re
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
            #links = soup.find("div", {"class": "tx-geipansearch-pi1"}).find_all('a')
            newObject = _cas;
            links = soup.find_all(href=re.compile("geipan-doc"))
            newObject['files'] = [{"name": _link.text, "link": _link.get('href')} for _link in links]
            print(str(_cas['_id']) + ' updated')
            db['Cas'].update_one({'_id': _cas['_id']}, {'$set': newObject})
        except:
            print("file not found -> append list")
            idCasFail.append(str(_cas['_id']))
    else:
        print("request fail -> append list")
        idCasFail.append(str(_cas['_id']))
cursor.close()
print(idCasFail)
