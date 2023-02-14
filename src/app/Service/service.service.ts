import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Pessoa } from '../Modelo/Pessoa';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http:HttpClient) { }

  url= 'http://localhost:8080/firstProject/pessoas'

  getPessoas(){
    return this.http.get<Pessoa[]>(this.url);
  }
}
