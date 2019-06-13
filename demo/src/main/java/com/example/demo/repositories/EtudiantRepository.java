package com.example.demo.repositories;

//import java.util.List;

import com.example.demo.models.Etudiant;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//import org.springframework.data.repository.query.Param;

@RepositoryRestResource
public interface EtudiantRepository extends JpaRepository<Etudiant,Long>{
    // //Method 1
    // @Query("select p from Etudiant e where e.nom like :x")
    // public List<Etudiant> chercher(@Param("x") String q);

    /*
    //Method 2
    public List<Etudiant> findByNomStartWith(String nom);
    */
}