package br.com.java.banco;

public class Conta {

	int agencia;
	int numero;
	double saldo;
	
	
	public Conta() {
		
	}
		
	public Conta(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}



	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void retirar(double valor) {
		saldo -= valor; 
	}
	
	public double verificarSaldo() {
		return saldo;
	}
	
}
