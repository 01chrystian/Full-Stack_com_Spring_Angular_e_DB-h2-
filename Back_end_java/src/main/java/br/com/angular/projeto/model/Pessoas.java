package br.com.angular.projeto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pessoas")
public class Pessoas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	private String apelido;

	public Pessoas() {
	}

	public Pessoas(String nome, String apelido) {
		super();
		this.nome = nome;
		this.apelido = apelido;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelidos(String apelido) {
		this.apelido = apelido;
	}

	@Override
	public String toString() {
		return "Pessoas [id=" + id + ", nome=" + nome + ", apelido=" + apelido + "]";
	}

	
}
