package com.example.projetspring.modele;
import jakarta.persistence.*;


@Entity
@Table(name="personne")
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO_INCREMENT
    @Column(name = "id_personne")
    int idpersonnel;

    @Column(name = "mail")
    String mail;

    @Column(name = "mdp")
    String mdp;
    
    public Personne(int idpersonnel, String mail, String mdp) {
        this.idpersonnel = idpersonnel;
        this.mail = mail;
        this.mdp = mdp;
    }
    
    public Personne(){}
    
    public int getIdpersonnel() {
        return idpersonnel;
    }

    public void setIdpersonnel(int idpersonnel) {
        this.idpersonnel = idpersonnel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    
}
