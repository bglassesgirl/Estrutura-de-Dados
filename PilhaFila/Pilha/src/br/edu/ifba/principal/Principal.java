package br.edu.ifba.principal;

import br.edu.ifba.pilha.Pilha;

public class Principal {
	
	public static void main(String[] args) {
		
		
		Pilha p = new Pilha();
		
		p.inserir("teste 1");
		p.inserir("teste 2");
		p.inserir("teste 3");
		p.inserir("teste 4");
		p.inserir("teste 5");
		
		
		System.out.println(p.mostrar());
		System.out.println(p.remove());
	
		
		
		if (p.verificar()) {
			System.out.println("Pilha vazia");
		}else {
			System.out.println("Pilha com elementos ");
		}
	}
}
