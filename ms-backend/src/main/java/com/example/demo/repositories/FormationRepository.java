package com.example.demo.repositories;

import com.example.demo.models.Formation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource
public interface FormationRepository extends JpaRepository<Formation,Long>{

}