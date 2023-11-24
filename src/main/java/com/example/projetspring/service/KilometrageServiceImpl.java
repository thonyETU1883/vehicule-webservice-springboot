package com.example.projetspring.service;

    
import org.springframework.stereotype.Service;

import com.example.projetspring.modele.Kilometrage;
import com.example.projetspring.repository.KilometrageRepository;


@Service
public class KilometrageServiceImpl{
    private final KilometrageRepository kilometrageRepository;

    public KilometrageServiceImpl(KilometrageRepository kilometrageRepository) {
        this.kilometrageRepository = kilometrageRepository;
    }

    public Kilometrage insertion(Kilometrage kilometrage){
        return this.kilometrageRepository.save(kilometrage);
    }

    /*public List<Kilometrage> listeKilometrage(Long idVehicule){
        return this.kilometrageRepository.findByVehiculeId(idVehicule);
    }*/
}
