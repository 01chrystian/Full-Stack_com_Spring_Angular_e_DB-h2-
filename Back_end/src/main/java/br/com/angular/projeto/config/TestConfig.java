package br.com.angular.projeto.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.angular.projeto.model.Pessoas;
import br.com.angular.projeto.repository.PessoasRepository;

@Configuration
public class TestConfig implements CommandLineRunner{

	@Autowired
	private PessoasRepository repository;
	
	@Override
	public void run(String... args) throws Exception {

		Pessoas p1 = new Pessoas("name1","Nam1");
		Pessoas p2 = new Pessoas("name2","Nam2");
		Pessoas p3 = new Pessoas("name3","Nam3");
		Pessoas p4 = new Pessoas("name4","Nam4");
		Pessoas p5 = new Pessoas("name5","Nam5");
		Pessoas p6 = new Pessoas("name6","Nam6");
		Pessoas p7 = new Pessoas("name7","Nam7");
		Pessoas p8 = new Pessoas("name8","Nam8");
		
		repository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8));

	}

}
