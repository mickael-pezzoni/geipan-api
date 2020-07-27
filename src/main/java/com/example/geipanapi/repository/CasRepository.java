package com.example.geipanapi.repository;

import com.example.geipanapi.entity.Cas;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.awt.print.Pageable;

public interface CasRepository extends MongoRepository<Cas, String>, PagingAndSortingRepository<Cas, String> {

    @Query("{'id_cas': ?0}")
    public Cas findById_cas(String id_cas);

    @Query("{}")
    public Page<Cas> findAll(PageRequest pageRequest, Sort sort);

}
