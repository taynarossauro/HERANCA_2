package models;

import java.time.LocalDate;

public class Clientes extends PessoaGeral {
	
	//Declarando atributos
	private String email;
	private String cartao_num;

	
	//Construtor da classe
	public Clientes(String nome, String cpf, LocalDate nascimento, String email, String cartao_num){
		super(nome, cpf, nascimento);
		this.email = email;
		this.cartao_num = cartao_num;
	}
	
	//Métodos para retornar os atributos	
	public String getEmail() {
		return email;
	}
	
	public String getCartaoNum() {
		return cartao_num;
	}
}

