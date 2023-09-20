package principal;

import servico.ServicoArrayInteiro;

public class PrincipalArrayInt {

	public static void main(String[] args) {
		
		ServicoArrayInteiro a = new ServicoArrayInteiro();
		
		a.adicionar(1);
		a.adicionar(2);
		a.adicionar(7);
		a.adicionar(3);
		
		System.out.println(a.segundoMaior());
		
		
		
		
	}
	
	
}
