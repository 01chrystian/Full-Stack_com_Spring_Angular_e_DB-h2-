package br.com.angular.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.angular.projeto.model.Pessoas;

@Repository
public interface PessoasRepository extends JpaRepository<Pessoas, Long>{

}
