package com.example.geipanapi.controllers;

import com.example.geipanapi.entity.Cas;
import com.example.geipanapi.repository.CasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cas")
@CrossOrigin(origins = "*")
public class CasController {

    @Autowired private CasRepository casRepository;
    public CasController() {

    }

    @GetMapping("/all")
    public List<Cas> getAll() {
        return this.casRepository.findAll();
    }

    @GetMapping("/idCas/{idCas}")
    public Cas findByIdCas(@PathVariable String idCas) {
        return this.casRepository.findById_cas(idCas);
    }
}
