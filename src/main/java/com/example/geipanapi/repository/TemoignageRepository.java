package com.example.geipanapi.repository;

import com.example.geipanapi.Temoignage.Temoignage;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TemoignageRepository extends MongoRepository<Temoignage,String> {
    
}
