package com.example.demo;

import com.example.demo.models.Etudiant;
import com.example.demo.models.Formation;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class GlobalRepositoryRestConfigurer implements RepositoryRestConfigurer {
    @Override
   
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration repositoryRestConfiguration){
        
        repositoryRestConfiguration.setReturnBodyOnCreate(true);
        repositoryRestConfiguration.setReturnBodyOnUpdate(true);
        
        repositoryRestConfiguration.exposeIdsFor(Formation.class,Etudiant.class);

        repositoryRestConfiguration.getCorsRegistry()
			.addMapping("/**")
			.allowedOrigins("*")
			.allowedHeaders("*")
			.allowedOrigins("OPTIONS","HEAD","GET","PUT","POST","DELETE","PATCH");
    }
}