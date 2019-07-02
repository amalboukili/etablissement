import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-et',
  templateUrl: './etudiants.component.html',
  styleUrls: ['./etudiants.component.css']
})
export class EtudiantsComponent implements OnInit {

  // type par défaut : any
  listFormations;
  listEtudiants;
  currentFormation={id:-1};

  constructor(private httpClient:HttpClient) { }

  ngOnInit() {
    this.httpClient.get("http://localhost:8081/formations")
    .subscribe(data =>{
      this.listFormations=data;
    }, err =>{
    console.log(err);
    });
    
  }

  onGetEtudiants(f){
    this.currentFormation=f;
    this.httpClient.get("http://localhost:8081/formations/"+f.id+"/etudiants")
    .subscribe(data=>{
      this.listEtudiants=data;
    }, err =>{
      console.log(err);
    });
  }

}
