package principal;

import servico.Servico;

public class PrincipalBinario {

	public static void main(String[] args) {
		
		Servico bin = new Servico();
		
		bin.adicionar(1);
		bin.adicionar(0);
		bin.adicionar(1);
		bin.adicionar(1);
		
		System.out.println(bin.converterBinario());
		
	}
	
}
