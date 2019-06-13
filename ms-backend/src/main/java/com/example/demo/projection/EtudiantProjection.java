package com.example.demo.projection;

import com.example.demo.models.Etudiant;
import com.example.demo.models.Formation;

import org.springframework.data.rest.core.config.Projection;

@Projection(name ="p1",types = {Etudiant.class})
public interface EtudiantProjection{
    public String getNom();
    public Formation getFormation();

}