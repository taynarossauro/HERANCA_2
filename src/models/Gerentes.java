package models;

import java.time.LocalDate;

public class Gerentes extends PessoaEmpresa{
	
	//Declarando atributos
	private String departamento;

	
	//Construtor da classe
	public Gerentes(String nome, String cpf, LocalDate nascimento, double salario, LocalDate contratacao, String departamento){
		super(nome, cpf, nascimento, salario, contratacao);
		this.departamento = departamento;
	}
	
	//Métodos para retornar os atributos
	public String getDepartamento() {
		return departamento;
	}

}
