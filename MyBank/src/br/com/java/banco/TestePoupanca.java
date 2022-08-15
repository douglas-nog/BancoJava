package br.com.java.banco;

public class TestePoupanca {

	public static void main(String[] args) {
		
		Conta poupancaDouglas = new Conta();
		poupancaDouglas.setAgencia(318);
		poupancaDouglas.setNumero(129027);
		
		Cliente douglas = new Cliente();
		
		poupancaDouglas.setCliente(douglas);
		
		douglas.setCpf("078.556.599-00");
		douglas.setNome("Douglas Nogueira");
		//douglas.setProfissao("Desenvolvedor Sênior"); Uma das formas de settar o atributo
		
		poupancaDouglas.getCliente().setProfissao("Desenvolvedor Sênior"); //Outra forma de settar o atributo 
		
		//System.out.println(poupancaDouglas.getCliente().getProfissao()); Teste da attibuição 
		
		System.out.println(poupancaDouglas.getCliente().getNome()); //Teste atribuição do titular
		
		System.out.println(poupancaDouglas.getSaldo());//Como não fizemos nenhum depósito obrigatoriamente precisa ser 0.0
		
		poupancaDouglas.depositar(10000.0);
		
		System.out.println(poupancaDouglas.getSaldo());
		
		poupancaDouglas.retirar(2000.0);
		
		System.out.println(poupancaDouglas.getSaldo());

		
		
		
		
		

	}

}
