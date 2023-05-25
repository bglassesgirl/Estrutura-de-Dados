package br.edu.ifba.principal;

import br.edu.ifba.lista.Lista;

public class Principal {

	public static void main(String[] args) {
		
		Lista lista = new Lista();
		lista.adicionarNoComeco("Luana");
		lista.adicionarNoComeco("Beatriz");
		lista.adicionarNoComeco("Julia");
		lista.adicionarNoComeco("Murilo");
		lista.adicionarNoComeco("Igor");
		
		lista.listar();
		System.out.println();
		
		lista.adicionarNoFinal("Maria Luiza");
		lista.adicionarNoFinal("Jennie");
		
		
		lista.listar();
		System.out.println();
		
		lista.adicionarPorPosicao(0, "Lorena");
		lista.adicionarPorPosicao(1, "Giovana");
		
		lista.listar();
		System.out.println();
		
		
	}
	
}


