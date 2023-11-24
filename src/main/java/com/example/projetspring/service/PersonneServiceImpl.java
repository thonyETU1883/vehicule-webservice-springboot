package com.example.projetspring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.projetspring.modele.Personne;
import com.example.projetspring.repository.PersonneRepository;

@Service
public class PersonneServiceImpl {
    
    private final PersonneRepository personneRepository;
    
    public PersonneServiceImpl(PersonneRepository personneRepository) {
        this.personneRepository = personneRepository;
    }

    public Personne authentification(String nom,String mdp){
        return personneRepository.findPersonne(nom,mdp);
    }
}
