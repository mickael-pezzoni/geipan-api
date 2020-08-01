#!/home/micka/anaconda3/bin/python
# coding: utf-8


from pymongo import MongoClient
import enchant
import json
import os
HOST = 'localhost'
DB = 'geipan'


cor = enchant.Dict("fr_FR")

mongo = MongoClient('mongodb://' + HOST)

db = mongo[DB]

cursor=db['Temoignage'].find({}, no_cursor_timeout=True).batch_size(20)

def checkOrtographe(resumeList):
    for word in enumerate(resumeList):
        try:
            if (cor.check(word[1]) == False):
                suggest = cor.suggest(word[1])
                if len(suggest) > 0:
                    print(word[1] + " -> " + suggest[0])
                    resumeList[word[0]] = suggest[0]
        except ValueError:
            print("## Fail ##")
    return " ".join(resumeList)


for _cas in cursor:
    correctif = _cas
    print(str(_cas['_id']))
    wordResume = _cas['tem_resume'].split(" ")
    correctif['tem_resume'] = checkOrtographe(wordResume)
    print(db['Temoignage'].update_one({"_id": _cas['_id']}, {"$set": correctif}))
    os.system('clear')
    
cursor.close()
