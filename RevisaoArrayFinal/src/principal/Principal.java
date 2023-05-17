package principal;

import basicas.Conta;
import servico.CadastrarConta;

public class Principal {

	public static void main(String[] args) {
		
		CadastrarConta cc = new CadastrarConta();
		
		Conta c = new Conta("Luana", 900.0);
		Conta c1 = new Conta("Bia", 1800.0);
		Conta c2 = new Conta("Julinha", 3800.0);
		Conta c3 = new Conta("Alisson", 2800.0);
		Conta c4 = new Conta("Murilo", 100.0);
		
		cc.adicionarConta(c);
		cc.adicionarConta(c1);
		cc.adicionarConta(c2);
		cc.adicionarConta(c3);                      	
		
		System.out.println(cc.listarConta().toString());
		
		cc.adicionarContaPorPosicao(c4, 3);
		System.out.println(cc.listarConta());
	
	    cc.removerContaPorPosicao(0);
	    System.out.println(cc.listarConta());
	    
	 
	    System.out.println(cc.procurarContaPorNome("Bia"));
	    
	    System.out.println( cc.procurarConta(2));
	   
	
	}
}
