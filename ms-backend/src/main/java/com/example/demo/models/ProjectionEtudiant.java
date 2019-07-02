package com.example.demo.models;

import org.springframework.data.rest.core.config.Projection;

@Projection(
  name = "p1", 
  types = { Etudiant.class }) 
public interface ProjectionEtudiant{
     String getNom();
     Formation getFormation();

}