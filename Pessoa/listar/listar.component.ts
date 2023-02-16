import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Pessoa } from 'src/app/Modelo/Pessoa';
import { ServiceService } from 'src/app/Service/service.service';

@Component({
  selector: 'app-listar',
  templateUrl: './listar.component.html',
  styleUrls: ['./listar.component.css'],
})
export class ListarComponent implements OnInit {
  
  constructor(private service: ServiceService, private router: Router) {  }

  pessoas!: Pessoa[];
  
  ngOnInit() { 
    this.service.getPessoas()
    .subscribe(data => {
      this.pessoas=data;
    })
   }
}
