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
		
		System.out.println("Listar elementos adicionados: ");
		lista.listar();
		System.out.println();
		
		lista.adicionarNoFinal("Maria Luiza");
		lista.adicionarNoFinal("Jennie");
		
		System.out.println("Listar elementos adicionados no final: ");
		lista.listar();
		System.out.println();
		
		
		lista.adicionarPorPosicao(0, "Lorena");
		lista.adicionarPorPosicao(1, "Giovana");
		
		
		System.out.println("Listar elementos adicionados por posição [posicao 0,1]: ");
		lista.listar();
		System.out.println();
		
	
		lista.removeDoComeco();
		System.out.println("Listar elementos removidos do começo: ");
		lista.listar();
		System.out.println();
		
		
		lista.removeFinal();
		System.out.println("Listar elementos removidos no final: ");
		lista.listar();
		System.out.println();
		
		
		lista.adicionarNoFinal("Alisson");
		System.out.println("Listar último elementos adicionados no final: ");
		lista.listar();
		System.out.println();
		
		
		lista.removePosicao(4);
		System.out.println("Listar elementos removidos no meio[posicao 4]: ");
		lista.listar();
		System.out.println();
		
		
	}
	
}


