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
	
	public void retirar(double valor) {
		if (saldo >= valor) {
			saldo -= valor; 
			System.out.println("Saque realizado com Sucesso!");
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public boolean tranferir(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.depositar(valor);
			return true;
		}else {
			return false;	
		}
	}
	
	public double verificarSaldo() {
		return saldo;
	}
}
