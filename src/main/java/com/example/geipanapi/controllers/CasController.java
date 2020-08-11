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

import java.lang.reflect.Executable;
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
    public ResultsPage getAll(@RequestParam("page") int selectPage, @RequestParam int pageSize, @RequestParam(required = false) String sort, @RequestParam(required = false) String sortDirection) {
        Sort sortInst;
        if (sort != null && sortDirection != null) {
             sortInst = Sort.by(sortDirection.equals("descend") ? Sort.Direction.DESC: Sort.Direction.ASC, sort);
        } else {
            sortInst = Sort.by(Sort.Direction.ASC, "cas_AAAA");
        }
        PageRequest pageRequest = PageRequest.of(selectPage, pageSize);
        Page<Cas> page;
        ResultsPage resultsPage = null;
        page = this.casRepository.findCustom(pageRequest, sortInst);
        resultsPage = new ResultsPage(selectPage, page.getTotalPages(), page.getTotalElements(), page.getContent());

        return resultsPage;
    }

    @GetMapping("/bydate")
    public ResultsPage getByDate(@RequestParam long start, @RequestParam long end) {
        PageRequest pageRequest = PageRequest.of(1, 20);
        Page<Cas> page = this.casRepository.findByDate(new Date(start), new Date(end), pageRequest);
        return new ResultsPage(1, page.getTotalPages(), page.getTotalElements(), page.getContent());
    }

    @GetMapping("/search")
    public List<Cas> getByFilter(@RequestParam String filterKey, @RequestParam String filterValue) {
        Query query = new Query(Criteria.where(filterKey).in(filterValue));
        /*Cas cas = new Cas();
        cas.setCas_resume(filter);
        Example<Cas> example = Example.of(cas, ExampleMatcher.matchingAny().withMatcher("cas_resume",ExampleMatcher.GenericPropertyMatchers.contains()).withIncludeNullValues());*/
        return this.mongoTemplate.find(query, Cas.class);
    }

    @GetMapping("/idCas/{idCas}")
    public Cas findByIdCas(@PathVariable String idCas) {
        return this.casRepository.findById_cas(idCas);
    }

}
