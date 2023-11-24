package com.example.projetspring.modele;

import jakarta.persistence.*;

@Entity
@Table(name="vehicule")
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO_INCREMENT
    @Column(name = "id_vehicule")
    int idVehicule;

    @Column(name = "numero")
    String numero;

    @Column(name = "marque")
    String marque;

    @Column(name = "place")
    double place;


    public Vehicule() {
    }


    public Vehicule(String numero, String marque, double place) {
        this.numero = numero;
        this.marque = marque;
        this.place = place;
    }

    public Vehicule(int idVehicule, String numero, String marque, double place) {
        this.idVehicule = idVehicule;
        this.numero = numero;
        this.marque = marque;
        this.place = place;
    }


    public int getIdVehicule() {
        return idVehicule;
    }

    public void setIdVehicule(int idVehicule) {
        this.idVehicule = idVehicule;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPlace() {
        return place;
    }

    public void setPlace(double place) {
        this.place = place;
    }
}
