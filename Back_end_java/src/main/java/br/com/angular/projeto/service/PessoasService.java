package br.com.angular.projeto.service;

import java.util.List;
import java.util.Optional;

import br.com.angular.projeto.model.Pessoas;


public interface PessoasService {

	List<Pessoas> listar();
	Optional<Pessoas> listarId(Long id);
	Pessoas add(Pessoas p);
	Pessoas edit(Pessoas p);
	Pessoas remove(Pessoas p);	
}
