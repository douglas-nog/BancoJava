package br.com.java.banco;

public class Teste {
	
	public static void main(String[] args) {
	
		Conta cc = new Conta();
		cc.agencia = 1234;
		cc.numero = 147258;
		cc.saldo = 1000.0;
		
		System.out.println("Saldo inicial CC R$" + cc.saldo);
		
		cc.depositar(100);
		cc.retirar(50);
		System.out.println("Saldo CC após depósito e saque R$" + cc.verificarSaldo());
		
		Conta poupanca = new Conta(4567, 369258, 500);
		
		System.out.println("Saldo inicial poupança R$" + poupanca.saldo);
		poupanca.depositar(5000);
		poupanca.retirar(600);
		System.out.println("Saldo poupança após depósito e saque R$" + poupanca.verificarSaldo());
		
		
		poupanca.tranferir(500, cc);
		System.out.println("Saldo poupança após transferência R$" + poupanca.saldo);
		System.out.println("Saldo CC após tranferência R$" + cc.saldo);
	}
}
