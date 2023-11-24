package com.example.projetspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetspring.modele.Kilometrage;
import com.example.projetspring.service.KilometrageServiceImpl;

@RestController
@RequestMapping("/Kilometrage")
public class KilometrageController {

    private final KilometrageServiceImpl kilometrageservice;

    @Autowired
    public KilometrageController(KilometrageServiceImpl kilometrageservice) {
        this.kilometrageservice = kilometrageservice;
    }

    @PostMapping("/create")
    public Kilometrage create(@RequestBody Kilometrage kilometrage){
        return this.kilometrageservice.insertion(kilometrage);
    }
}
