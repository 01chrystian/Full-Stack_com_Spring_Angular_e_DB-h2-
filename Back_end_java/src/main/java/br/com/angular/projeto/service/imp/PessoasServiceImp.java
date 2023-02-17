package br.com.angular.projeto.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.angular.projeto.model.Pessoas;
import br.com.angular.projeto.repository.PessoasRepository;
import br.com.angular.projeto.service.PessoasService;

@Service
public class PessoasServiceImp implements PessoasService {

	@Autowired
	PessoasRepository rep;
	
	@Override
	public Pessoas add(Pessoas p) {
		rep.save(p);
		return p; 
	}

	@Override
	public Pessoas edit(Pessoas p) {
		return null;
	}

	@Override
	public List<Pessoas> listar() {
		List<Pessoas> p = rep.findAll();
		return p;
	}
	
	@Override
	public Optional<Pessoas> listarId(Long id) {
	 	Optional<Pessoas> p = rep.findById(id);
		return p;
	}
	
	@Override
	public Pessoas remove(Pessoas p) {
		rep.delete(p);
		return null;
	}	
}
