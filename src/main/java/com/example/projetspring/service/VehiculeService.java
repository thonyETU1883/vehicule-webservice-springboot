package com.example.projetspring.service;

import com.example.projetspring.modele.Vehicule;
import java.util.List;

public interface VehiculeService {
    Vehicule insertion(Vehicule vehicule);
    List<Vehicule> listeVehicule();
    Vehicule update(int idvehicule,Vehicule modifier);
    void delete(int idvehicule);
}
