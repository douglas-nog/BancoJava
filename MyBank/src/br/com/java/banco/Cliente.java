package br.com.java.banco;

public class Cliente {
	String nome;
	String cpf;
	Endereco endereco;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		}
}
