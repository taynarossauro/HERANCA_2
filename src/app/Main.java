package app;
import models.*;
import java.time.LocalDate;  // Importando a classe LocalDate


public class Main {
	
	public static void main (String args[]) { 
	//Criando uma pessoa
	PessoaGeral  pessoa_1 = new PessoaGeral("Taynara Raquel","566.789.098-05", LocalDate.of(1988, 2, 9));
	
	//Criando um cliente
	Clientes c = new Clientes("Taynara", "565.543.323-09", LocalDate.of(1988, 2, 9), "taynara@dominio.com", "1234.5678.9101.1234");

	//Criando um gerente
	Gerentes g = new Gerentes("Sarah", "565.543.323-09", LocalDate.of(1988, 2, 9), 1900, LocalDate.of(2022, 10, 2), "RH");
	
	//Criando um vendedor
	Vendedores v = new Vendedores("Rógel", "465.243.322-09", LocalDate.of(2004, 2, 9), 1850, LocalDate.of(2022, 10, 2), 20);
	
	// Printando os dados
	System.out.print("Dados de uma pessoa:" + "\nNome: " + pessoa_1.getNome() + 
		"\nCPF: " + pessoa_1.getCpf() + "\nData de Nascimento: " + pessoa_1.getNascimento() + "\n\n");

	System.out.print("Dados de um cliente:" + "\nNome: " + c.getNome() + 
		"\nCPF: " + c.getCpf() + "\nData de Nascimento: " + c.getNascimento() + 
		"\nEmail: " + c.getEmail() + "\nNúmero do cartão: " + c.getCartaoNum() + "\n\n");
			
	System.out.print("Dados de um gerente:" + "\nNome: " + g.getNome() + 
		"\nCPF: " + g.getCpf() + "\nData de Nascimento: " + g.getNascimento() + 
		"\nSalário: " + g.getSalario() + "\nData de contratação: " + g.getContratacao() + 
		"\nDepartamento: " + g.getDepartamento() + "\n\n");
			
	System.out.print("Dados de um vendedor:" + "\nNome: " + v.getNome() + 
		"\nCPF: " + v.getCpf() + "\nData de Nascimento: " + v.getNascimento() + 
		"\nSalário: " + v.getSalario() + "\nData de Admissão: " + v.getContratacao() + 
		"\nComissão: " + v.getComissao() + "%\n\n");
	
	}
}
