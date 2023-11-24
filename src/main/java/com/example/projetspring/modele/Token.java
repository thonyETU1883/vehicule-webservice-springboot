package com.example.projetspring.modele;

import java.security.SecureRandom;

import java.util.Base64;

import jakarta.persistence.Column;

import java.time.LocalDateTime;
import jakarta.persistence.*;


public class Token {

    @Id
    @Column(name = "id_token")
    String idtoken;

    @Column(name = "debut")
    LocalDateTime  debut;

    @Column(name = "fin")
    LocalDateTime  fin;

    @Column(name = "id_personne")
    int idpersonne;
    int duree = 10;
    
    public Token(String idtoken, LocalDateTime  debut, LocalDateTime  fin,int idpersonne) {
        this.idtoken = idtoken;
        this.debut = debut;
        this.fin = fin;
        this.idpersonne = idpersonne;
    }

    public String getIdtoken() {
        return idtoken;
    }


    public void setIdtoken(String idtoken) {
        this.idtoken = idtoken;
    }


    public LocalDateTime  getDebut() {
        return debut;
    }


    public void setDebut(LocalDateTime  debut) {
        this.debut = debut;
    }


    public LocalDateTime  getFin() {
        return fin;
    }


    public void setFin(LocalDateTime  fin) {
        this.fin = fin;
    }

    public int getidpersonne(){
        return this.idpersonne;
    }

    public void setidpersonne(int idpersonne){
        this.idpersonne = idpersonne;
    }

    public Token genererToken(int idpersonne){
        SecureRandom random = new SecureRandom();
        Base64.Encoder base64Encoder = Base64.getUrlEncoder();
        byte bytes[] = new byte[24];
        random.nextBytes(bytes);
        String tokencaractere =  base64Encoder.encodeToString(bytes);
        LocalDateTime debut = LocalDateTime.now();
        LocalDateTime fin = debut.plusMinutes(duree);
        Token token = new Token(tokencaractere,debut,fin,idpersonne);
        return token;
    }
}
