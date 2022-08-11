package br.com.java.banco;

public class Teste {
	
	public static void main(String[] args) {
	
		Conta cc = new Conta();
		cc.agencia = 1234;
		cc.numero = 147258;
		cc.saldo = 1000.0;
		
		cc.depositar(100);
		cc.retirar(50);
		System.out.println(cc.verificarSaldo());
		
		Conta poupanca = new Conta(4567, 369258, 500);
		
		poupanca.depositar(5000);
		poupanca.retirar(600);
		System.out.println(poupanca.verificarSaldo());
	}
}
