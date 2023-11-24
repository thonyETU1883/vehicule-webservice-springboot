package com.example.projetspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetspring.modele.Personne;
import com.example.projetspring.service.PersonneServiceImpl;

@RestController
@RequestMapping("/Personne")
public class PersonneController {
        private final PersonneServiceImpl personneservice;

        @Autowired
        public PersonneController(PersonneServiceImpl personneservice) {
            this.personneservice = personneservice;
        }

        @PostMapping("/login/{mail}/{mdp}")
        public Personne authentification(@PathVariable String mail,@PathVariable String mdp){
            return personneservice.authentification(mail,mdp);
        }

}
