#!/home/micka/anaconda3/bin/python
# coding: utf-8

from pymongo import MongoClient
import requests
from datetime import datetime

HOST = "localhost"
mongo = MongoClient('mongodb://' + HOST)
db = mongo['geipan']
col = db['Cas']

failValue = list()

for doc in col.find({}):
    obj = doc
    try:
        obj["cas_date_maj"] = datetime.strptime(doc['cas_date_maj'],"%Y-%m-%d")
        print(col.update_one({"_id": doc['_id']}, {"$set": obj}))
    except ValueError:
        failValue.append({
            "id": doc['_id'],
            "date": doc["obs_date_heure"]
        })
        print("value fail")
    except TypeError:
        print("Type fail")
    #print(dt)

print([fail for fail in failValue])