#!/home/micka/anaconda3/bin/python
# coding: utf-8


from pymongo import MongoClient
import requests
import json
import re
import os
HOST = 'localhost'
DB = 'geipan'



mongo = MongoClient('mongodb://' + HOST)

db = mongo[DB]

cursor=db['Cas'].find({}, no_cursor_timeout=True).batch_size(20)
idCasFail = list()
for _cas in cursor:
        newObject = _cas;
        for _file in  enumerate(newObject['files']):
            if not 'http' in _file[1]:
                print(_file)
                newObject['files'][_file[0]]['link'] = 'http://www.cnes-geipan.fr/' + _file[1]['link']
                print(newObject['files'])
                db['Cas'].update_one({'_id': _cas['_id']}, {'$set': newObject})
cursor.close()
print(idCasFail)
