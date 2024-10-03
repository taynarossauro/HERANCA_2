package models;

import java.time.LocalDate;

public class PessoaEmpresa extends PessoaGeral {
	
	//Declarando atributos
	private double salario;
	private LocalDate contratacao;

	
	//Construtor da classe
	public PessoaEmpresa(String nome, String cpf, LocalDate nascimento, double salario, LocalDate contratacao){
		super(nome, cpf, nascimento);
		this.salario = salario;
		this.contratacao = contratacao;
	}
	
	//Métodos para retornar os atributos
	public double getSalario() {
		return salario;
	}
	
	public LocalDate getContratacao() {
		return contratacao;
	}
}

