
--database : gestionVehicule;

CREATE TABLE vehicule (
    id_vehicule INTEGER PRIMARY KEY AUTO_INCREMENT,
    numero VARCHAR(100),
    marque VARCHAR(100),
    place DOUBLE
);


CREATE TABLE kilometrage(
    id_kilometrage INTEGER PRIMARY KEY AUTO_INCREMENT,
    id_vehicule INTEGER,
    date DATE,
    debut DOUBLE,
    fin DOUBLE,
    FOREIGN KEY(id_vehicule) REFERENCES vehicule(id_vehicule) 
);

CREATE TABLE personne (
    id_personne INTEGER PRIMARY KEY AUTO_INCREMENT,
    mail VARCHAR(20),
    mdp VARCHAR(10)
);

CREATE TABLE token(
    id_token VARCHAR(100) PRIMARY KEY,
    debut TIMESTAMP,
    fin TIMESTAMP,
    id_personne INTEGER,
    FOREIGN KEY(id_personne) REFERENCES personne(id_personne)
);

