package br.com.angular.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.angular.projeto.model.Pessoas;
import br.com.angular.projeto.service.PessoasService;

@RestController
@RequestMapping({"/pessoas"})
public class PessoasController {

	@Autowired
	PessoasService service;
	
	@CrossOrigin
	@GetMapping
	public List<Pessoas>listar(){
		return service.listar();
	}
	@CrossOrigin
	@PostMapping(value="/add")
	public void addPessoa(@RequestBody Pessoas p) {
		service.add(p);
	}
}
