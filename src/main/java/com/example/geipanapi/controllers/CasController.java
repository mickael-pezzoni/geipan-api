package com.example.geipanapi.controllers;

import com.example.geipanapi.entity.Cas;
import com.example.geipanapi.entity.ResultsPage;
import com.example.geipanapi.repository.CasRepository;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.query.Criteria;
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

    @GetMapping("/page")
    public ResultsPage getAll(@RequestParam("page") int selectPage, @RequestParam int pageSize) {
        Sort sort = Sort.by(Sort.Direction.ASC, "cas_AAAA");
        PageRequest pageRequest = PageRequest.of(selectPage, pageSize);
        Page<Cas> page = this.casRepository.findAll(pageRequest, sort);

        ResultsPage resultsPage = new ResultsPage(selectPage, page.getTotalPages(), page.getTotalElements(), page.getContent());
        return resultsPage;
    }

    @GetMapping("/idCas/{idCas}")
    public Cas findByIdCas(@PathVariable String idCas) {
        return this.casRepository.findById_cas(idCas);
    }

}
