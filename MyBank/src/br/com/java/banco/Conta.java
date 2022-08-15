package br.com.java.banco;

import java.io.Serializable;

/**
 * Classe que abstrai uma Conta Bancária
 * @author Douglas Nogueira
 * @version 1.0*/
 
public class Conta implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * Número da agência
	 */
	private int agencia;
	/**
	 * Número da conta
	 */
	private int numero;
	/**
	 * Saldo da conta
	 */
	private double saldo;
	/**
	 * Chamada para a Classe Cliente 
	 */
	private Cliente titular;
	
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
			this.saldo -= valor;
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
		}else{
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (numero <= 0) {
			System.out.println("O número de conta não pode ser negativo!");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("O número de conta não pode ser negativo!");
			return;
		}
		this.numero = numero;
	}

	public Cliente getCliente() {
		return titular;
	}

	public void setCliente(Cliente titular) {
		this.titular = titular;
	}

}