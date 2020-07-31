package com.example.geipanapi.repository;

import com.example.geipanapi.entity.Cas;
import com.example.geipanapi.entity.Temoignage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface TemoignageRepository extends MongoRepository<Temoignage,String>, PagingAndSortingRepository<Temoignage, String> {

    @Query("{}")
    public Page<Temoignage> findAll(PageRequest pageRequest, Sort sort);

    @Query("{'id_cas': ?0}")
    public List<Temoignage> findById_cas(int id_cas);
}
