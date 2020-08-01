package com.example.geipanapi.controllers;

import com.example.geipanapi.entity.Cas;
import com.example.geipanapi.entity.ResultsPage;
import com.example.geipanapi.repository.CasRepository;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/cas")
@CrossOrigin(origins = "*")
public class CasController {

    @Autowired private CasRepository casRepository;
    private MongoTemplate mongoTemplate;

    public CasController(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @GetMapping("/all")
    public List<Cas> getAll() {
        return this.casRepository.findAll();
    }

    @GetMapping("/group")
    public List<DBObject> getCasByClassification() {
        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.group("cas_classification").addToSet(new BasicDBObject(){
                    {
                        put("id_cas", "$id_cas");
                        put("dossierName", "$cas_nom_dossier");
                        put("cas_AAAA", "$cas_AAAA");
                    }
                }).as("values")
        );

        AggregationResults<DBObject> aggregationResults = this.mongoTemplate.aggregate(aggregation, "Cas", DBObject.class);
        return aggregationResults.getMappedResults();
    }

    @PutMapping("")
    public void editCas(@RequestBody Cas casUpdate) {
        this.casRepository.save(casUpdate);
    }

    @GetMapping("/page")
    public ResultsPage getAll(@RequestParam("page") int selectPage, @RequestParam int pageSize, @RequestParam(required = false) Integer filter) {
        Sort sort = Sort.by(Sort.Direction.ASC, "cas_AAAA");
        PageRequest pageRequest = PageRequest.of(selectPage, pageSize);
        Page<Cas> page;
        ResultsPage resultsPage = null;
        if (filter != null) {
            Query query = new Query(new Criteria("cas_AAAA").alike(Example.of(filter, ExampleMatcher.matching().withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING))));
            List<Cas> cas = this.mongoTemplate.find(query, Cas.class);
            System.out.println(cas.size());
            resultsPage = new ResultsPage(selectPage, 0, cas.size(), cas);
        } else {
            page = this.casRepository.findAll(pageRequest);
            resultsPage = new ResultsPage(selectPage, page.getTotalPages(), page.getTotalElements(), page.getContent());

        }

        return resultsPage;
    }

    @GetMapping("/search")
    public List<Cas> testSearch(@RequestParam(required = false) String filter) {
        if (filter != null) {
            Cas casSearch = new Cas();
            casSearch.setCas_resume(filter);
            ExampleMatcher exampleMatcher = ExampleMatcher.matching().withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING).withIgnoreNullValues();
            Example<Cas> casExample = Example.of(casSearch, exampleMatcher);
            return this.casRepository.findAll(casExample);
        } else {
            return this.casRepository.findAll();
        }
    }

    @GetMapping("/idCas/{idCas}")
    public Cas findByIdCas(@PathVariable String idCas) {
        return this.casRepository.findById_cas(idCas);
    }

}
