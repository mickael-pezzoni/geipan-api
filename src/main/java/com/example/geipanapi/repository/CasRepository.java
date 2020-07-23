package com.example.geipanapi.repository;

import com.example.geipanapi.entity.Cas;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CasRepository extends MongoRepository<Cas, String> {

    public Cas findById_cas(String idCas);
}
