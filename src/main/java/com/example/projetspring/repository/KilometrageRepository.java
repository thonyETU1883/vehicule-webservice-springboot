package com.example.projetspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetspring.modele.Kilometrage;

public interface KilometrageRepository extends  JpaRepository<Kilometrage,Integer>{
    
}
