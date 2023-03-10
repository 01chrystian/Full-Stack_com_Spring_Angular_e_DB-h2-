import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Pessoa } from '../Modelo/Pessoa';
import { FormGroup } from '@angular/forms';

@Injectable({
  providedIn: 'root',
})
export class ServiceService {
  constructor(private http: HttpClient) {}

  url = 'http://localhost:60/pessoas';

  url_post_add = 'http://localhost:60/pessoas/add';

  getPessoas() {
    return this.http.get<Pessoa[]>(this.url);
  }

  addPessoa(pessoa: Pessoa) {
    return this.http.post<Pessoa>(this.url_post_add, pessoa);
  }

  getPessoaId(id: number) {
    return this.http.get<Pessoa>(this.url + '/' + id);
  }

  updatePessoa(pessoa: Pessoa) {
    return this.http.put<Pessoa>(this.url + '/' + pessoa.id, pessoa);
  }

  deletePessoa(pessoa: Pessoa) {
    return this.http.delete<Pessoa>(this.url + '/' + pessoa.id);
  }
}
