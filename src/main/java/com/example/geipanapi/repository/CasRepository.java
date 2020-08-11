package com.example.geipanapi.repository;

import com.example.geipanapi.entity.Cas;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.awt.*;
import java.awt.print.Pageable;
import java.util.Date;
import java.util.List;

public interface CasRepository extends MongoRepository<Cas, String>, PagingAndSortingRepository<Cas, String> {

    @Query("{'id_cas': ?0}")
    public Cas findById_cas(String id_cas);

    @Query("{}")
    public Page<Cas> findCustom(PageRequest pageRequest, Sort sort);


    @Query("{'cas_date_maj' : { $gte: ?0, $lte: ?1 } }")
    public Page<Cas> findByDate(Date from, Date to, PageRequest pageRequest);


}
