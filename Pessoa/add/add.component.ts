import { Component, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';

import { Router } from '@angular/router';
import { Pessoa } from 'src/app/Modelo/Pessoa';
import { ServiceService } from 'src/app/Service/service.service';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css'],
})
export class AddComponent implements OnInit {
  constructor(private service: ServiceService, private router: Router) {}

  ngOnInit() {}

  enviar() {
    var nome: any = document.getElementById('nome');
    var apelido: any = document.getElementById('apelido');

    var user = {
      id: Number,
      nome: nome.value,
      apelido: apelido.value,
    };

    this.addPessoa(user);
  }

  addPessoa(pessoa: Pessoa) {
    this.service.addPessoa(pessoa).subscribe((data) => {
      alert('Pessoa cadastrada com sucesso!');
      this.router.navigate(['listar']);
    });
  }
}
