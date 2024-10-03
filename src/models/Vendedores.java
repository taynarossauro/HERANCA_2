package models;

import java.time.LocalDate;

public class Vendedores extends PessoaEmpresa{
	
	//Declarando atributos
	private double comissao;

	
	//Construtor da classe
	public Vendedores(String nome, String cpf, LocalDate nascimento, double salario, LocalDate contratacao, double comissao){
		super(nome, cpf, nascimento, salario, contratacao);
		this.comissao = comissao;
	}
	
	//Métodos para retornar os atributos
	public double getComissao() {
		return comissao;
	}

}
