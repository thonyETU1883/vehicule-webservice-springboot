package com.example.projetspring.modele;

import jakarta.persistence.*;

@Entity
@Table(name="kilometrage")
public class Kilometrage {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO_INCREMENT
    @Column(name = "id_kilometrage")
    int idKilometrage;

    @Column(name = "id_vehicule")
    int idVehicule;

    @Column(name = "date")
    String date;

    @Column(name = "debut")
    double debut;

    @Column(name = "fin")
    double fin;


    public Kilometrage() {
    }

    public Kilometrage(int idKilometrage, int idVehicule, String date, double debut, double fin) {
        this.idKilometrage = idKilometrage;
        this.idVehicule = idVehicule;
        this.date = date;
        this.debut = debut;
        this.fin = fin;
    }

    public int getIdKilometrage() {
        return idKilometrage;
    }

    public void setIdKilometrage(int idKilometrage) {
        this.idKilometrage = idKilometrage;
    }

    public int getIdVehicule() {
        return idVehicule;
    }

    public void setIdVehicule(int idVehicule) {
        this.idVehicule = idVehicule;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getDebut() {
        return debut;
    }

    public void setDebut(double debut) {
        this.debut = debut;
    }

    public double getFin() {
        return fin;
    }

    public void setFin(double fin) {
        this.fin = fin;
    }

}