package br.com.java.banco;
/**
 * Classe que abstrai uma Conta Bancária
 * @author dougl
 *@version 1.0<h3></h3>*/
 
public class Conta {
	/*
	 * Número da agência
	 */
	int agencia;
	/**
	 * Número da conta
	 */
	int numero;
	/**
	 * Saldo da conta
	 */
	double saldo;
	/**
	 * Chamada para a Classe Cliente 
	 */
	Cliente cliente;
	
	/**
	 * Método para criação default 
	 */
	public Conta() {	
	}
	
	/**
	 * Criação de Conta com parâmetros pré-definidos 
	 * @param agencia número da agência 
	 * @param numero número da Conta
	 * @param saldo inicial 
	 */
	public Conta(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}

	/**
	 * Acrescenta saldo à conta 
	 * @param valor que será depositado 
	 */
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	/**
	 * Retira saldo da conta
	 * @param valor que será retirado 
	 * @return se a transação foi ou não efetuada 
	 */
	public boolean retirar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		}else {
			System.out.println("Saldo insuficiente para saque.");
			return false;
		}
	}
	
	/**
	 * Realiza tranferência de saldo entre contas 
	 * @param valor que será tranferido 
	 * @param destino conta que receberá o recurso 
	 * @return se a transação foi ou não realizada 
	 */
	public boolean tranferir(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.depositar(valor);
			return true;
		}else {
			return false;	
		}
	}
	/**
	 * Consulta saldo atual da Conta 
	 * @return Valor do saldo atual 
	 */
	public double verificarSaldo() {
		return saldo;
	}
}
