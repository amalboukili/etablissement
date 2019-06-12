package com.example.demo.repositories;

<<<<<<< HEAD
//import java.util.List;
=======
import java.util.List;
>>>>>>> faa4dec... first commit

import com.example.demo.models.Etudiant;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//import org.springframework.data.repository.query.Param;

@RepositoryRestResource
public interface EtudiantRepository extends JpaRepository<Etudiant,Long>{
    // //Method 1
    // @Query("select p from Etudiant e where e.nom like :x")
    // public List<Etudiant> chercher(@Param("x") String q);
=======
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.repository.query.Param;

@RepositoryRestResource
public interface EtudiantRepository extends JpaRepository<Etudiant,Long>{
    //Method 1
    @Query("select p from Etudiant e where e.nom like : x")
    public List<Etudiant> cherche(@Param("x") String nom);
>>>>>>> faa4dec... first commit

    /*
    //Method 2
    public List<Etudiant> findByNomStartWith(String nom);
    */
}