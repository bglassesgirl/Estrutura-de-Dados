package br.edu.ifba.principal;

import br.edu.br.lista.Lista;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lista um = new Lista();
		um.adicionarNoComeco("um");
		um.adicionarNoComeco("dois");
	    um.adicionarNoComeco("três");
		
		um.imprimir();
		
	}

}
