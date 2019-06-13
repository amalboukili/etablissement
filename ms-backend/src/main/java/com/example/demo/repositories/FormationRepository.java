package com.example.demo.repositories;

import com.example.demo.models.Formation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FormationRepository extends JpaRepository<Formation,Long>{

}