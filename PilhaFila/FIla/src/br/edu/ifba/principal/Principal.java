package br.edu.ifba.principal;

import br.edu.ifba.fila.Fila;

public class Principal {

	public static void main(String[] args) {
		
		Fila f = new Fila();
		
		f.inserir("teste 1");
		f.inserir("teste 2");
		f.inserir("teste 3");
		f.inserir("teste 4");
		f.inserir("teste 5");
		
		System.out.println(f.mostrar());
		System.out.println("");
		System.out.println(f.remover());
		System.out.println("");
		System.out.println(f.mostrar());
		
		
		System.out.println("");
		if (f.verificar()) {
			System.out.println("Lista com elementos.");
		}else {
			System.out.println("Lista vazia");
		}
		
		
		
	}
	
}
