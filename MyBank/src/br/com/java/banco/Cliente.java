package br.com.java.banco;

import java.util.Date;

public class Cliente {
	String nome;
	String cpf;
	Date dataNasc;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, String cpf, Date dataNasc) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		}
}
