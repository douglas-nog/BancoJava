package br.com.java.banco;

public class TesteCc {
	
	public static void main(String[] args) {
		
		Conta ccDouglas = new Conta();
		ccDouglas.setAgencia(4042);
		ccDouglas.setNumero(110967);
		ccDouglas.depositar(10000.0);
		
		Cliente douglas = new Cliente();
		douglas.setNome("Douglas Nogueira");
		douglas.setCpf("078.556.599-00");
		douglas.setProfissao("Desenvolvedor");
				
		ccDouglas.setCliente(douglas);
		
		System.out.println(ccDouglas.getCliente().getNome());
		System.out.println(ccDouglas.getCliente().getCpf());
		System.out.println(ccDouglas.getCliente().getProfissao());
		
		System.out.println("Saldo inicial CC R$" + ccDouglas.getSaldo());
		
		ccDouglas.depositar(100);
		ccDouglas.retirar(50);
		System.out.println("Saldo CC após depósito e saque R$" + ccDouglas.getSaldo());
			
		//Criação da poupança, agora o saldo não é mais modificável, apenas através da função saque/depósito/trans
		Conta poupancaDouglas = new Conta();
		poupancaDouglas.setNumero(110967);
		poupancaDouglas.setAgencia(4042);
		
		poupancaDouglas.setCliente(douglas);
		
		System.out.println("Crianda a conta poupança número: " + poupancaDouglas.getNumero() + 
				" para o Cliente " + poupancaDouglas.getCliente().getNome() + ".");
		
		ccDouglas.tranferir(5000.00, poupancaDouglas);
		
		System.out.println("Saldo poupança após transferência R$" + poupancaDouglas.getSaldo());
		
		System.out.println("Saldo Conta Corrente após transferência R$" + ccDouglas.getSaldo());
	}
}
