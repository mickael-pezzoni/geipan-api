package com.example.geipanapi.controllers;

import com.example.geipanapi.entity.Cas;
import com.example.geipanapi.entity.ResultsPage;
import com.example.geipanapi.repository.CasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
