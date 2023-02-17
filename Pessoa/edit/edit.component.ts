import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from 'src/app/Service/service.service';
import { Pessoa } from 'src/app/Modelo/Pessoa';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css'],
})
export class EditComponent implements OnInit {
  constructor(private router: Router, private service: ServiceService) {}

  pessoa = new Pessoa();

  ngOnInit(): void {
    this.Editar();
  }

  Editar() {
    let id: any = localStorage.getItem('id');
    this.service.getPessoaId(id).subscribe((data) => {
      this.pessoa = data;
    });
  }

  Atualizar(pessoa: Pessoa) {
    this.service.updatePessoa(pessoa).subscribe((data) => {
      this.pessoa = data;
      alert('Usuário atualizado com sucesso!');
      this.router.navigate(['listar']);
    });
  }
}
