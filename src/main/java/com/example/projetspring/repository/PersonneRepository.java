package com.example.projetspring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.projetspring.modele.Personne;

public interface PersonneRepository extends  JpaRepository<Personne,Integer>{

    @Query("SELECT p FROM Personne p WHERE p.mail = :mail AND p.mdp = :mdp")
    Personne findPersonne(String mail,String mdp);

}
