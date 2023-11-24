package com.example.projetspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.projetspring.service.VehiculeServiceImpl;
import com.example.projetspring.modele.Vehicule;

@RestController
@RequestMapping("/vehicule")
public class VehiculeController {

    private final VehiculeServiceImpl vehiculeservice;

    @Autowired
    public VehiculeController(VehiculeServiceImpl vehiculeservice){
        this.vehiculeservice = vehiculeservice;
    }

    @PostMapping("/create")
    public Vehicule create(@RequestBody Vehicule vehicule){
        return this.vehiculeservice.insertion(vehicule);
    }

    @GetMapping("/hello")
    public String salue(){
        return "hello world";
    }


    @PostMapping("/liste")
    public List<Vehicule> getListeVehicule(){ 
        return this.vehiculeservice.listeVehicule();
    }


    @PutMapping("/updateVehicule/{idvehicule}")
    public Vehicule updateVehicule(@PathVariable int idvehicule,@RequestBody Vehicule modifier){
        return this.vehiculeservice.update(idvehicule, modifier);
    }

    @PostMapping("/deleteVehicule/{idvehicule}")
    public void deleteVehicule(@PathVariable int idvehicule){
        this.vehiculeservice.delete(idvehicule);
    }
}
