package com.example.demo;

import java.util.Date;

import com.example.demo.models.Etudiant;
import com.example.demo.models.Formation;
import com.example.demo.repositories.EtudiantRepository;
import com.example.demo.repositories.FormationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	@Autowired
	private EtudiantRepository etudiantRepository;
	
	@Autowired
	private FormationRepository formationRepository;

	//Configurer String data rest pour voir id
	@Autowired
	//private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		

		Formation f1 =formationRepository.save(new Formation(null,"PHP",30,null));
		Formation f2 = formationRepository.save(new Formation(null,"Java",30,null));
		Formation f3 = formationRepository.save(new Formation(null,"Oracle",30,null));

		Etudiant et = new Etudiant(null,"Hassan","Hassan",new Date(),f1);
		etudiantRepository.save(et);
		etudiantRepository.save(new Etudiant(null,"Mohammed","Mohammed",new Date(),f1));
		etudiantRepository.save(new Etudiant(null,"Hannan","Hannan",new Date(),f2));
		etudiantRepository.save(new Etudiant(null,"Fatima","Fatima",new Date(),f3));
		etudiantRepository.save(new Etudiant(null,"Nabila","Nabila",new Date(),f3));
	}

}
