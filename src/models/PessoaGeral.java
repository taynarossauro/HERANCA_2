package models;

import java.time.LocalDate;

public class PessoaGeral {
	
	//Declarando atributos
	private String nome;
	private String cpf;
	private LocalDate nascimento;
	
	//Construtor da classe
	public PessoaGeral(String nome, String cpf, LocalDate nascimento){
		this.nome = nome;
		this.cpf = cpf;
		this.nascimento = nascimento;
	}
	
	//Métodos para retornar os atributos
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public LocalDate getNascimento() {
		return nascimento;
	}
}

