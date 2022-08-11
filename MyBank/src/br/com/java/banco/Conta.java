package br.com.java.banco;

public class Conta {

	int agencia;
	int numero;
	double saldo;
	Cliente cliente;
	
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
	
	public boolean retirar(double valor) {
		if (saldo >= valor) {
			saldo -= valor; 
			return true;
		}else {
			return false;
		}
		
	}
	
	public double verificarSaldo() {
		return saldo;
	}
}
