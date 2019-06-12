package com.example.demo.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
=======
>>>>>>> faa4dec... first commit
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "etudiants")
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
<<<<<<< HEAD
    @ManyToOne
    //Clé etranger par défaut c'est formation_id
    @JoinColumn(name = "ID_FORMATION")
    private Formation formation;

 }
=======

}
>>>>>>> faa4dec... first commit
