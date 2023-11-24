package com.example.projetspring.service;

import org.springframework.stereotype.Service;
import com.example.projetspring.modele.Vehicule;
import java.util.List;
import com.example.projetspring.repository.VehiculeRepository;


@Service
public class VehiculeServiceImpl implements VehiculeService{
    
   private final VehiculeRepository vehiculeRepository;

    public VehiculeServiceImpl(VehiculeRepository vehiculeRepository){
        this.vehiculeRepository = vehiculeRepository;
    }

    @Override
    public Vehicule insertion(Vehicule vehicule){
        return this.vehiculeRepository.save(vehicule);
    } 

    @Override
    public List<Vehicule> listeVehicule(){
        return this.vehiculeRepository.findAll();
    }

    @Override
    public Vehicule update(int idvehicule,Vehicule modifier){
        return this.vehiculeRepository.findById(idvehicule).map(
            newVehicule ->{
                newVehicule.setNumero(modifier.getNumero());
                newVehicule.setMarque(modifier.getMarque());
                newVehicule.setPlace(modifier.getPlace());
                return vehiculeRepository.save(newVehicule);
            }
        ).orElseThrow(() -> new RuntimeException("vehicule pas trouver"));
    }

    @Override
    public void delete(int idvehicule){
        this.vehiculeRepository.deleteById(idvehicule);
    }
}
