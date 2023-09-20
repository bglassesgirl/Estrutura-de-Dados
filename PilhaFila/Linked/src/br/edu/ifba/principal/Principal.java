package br.edu.ifba.principal;

import br.edu.ifba.basicas.Pessoa;
import br.edu.ifba.dao.Lista;

public class Principal {

	public static void main(String[] args) {
		
		Lista l = new Lista();
		Pessoa p = new Pessoa();
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p.setNome("Maria Luiza");
		p.setCpf(129120912);
		p1.setNome("Luana");
		p1.setCpf(229120912);
		p2.setNome("Lorena");
		p2.setCpf(229120912);
		
		l.adicionaInicio(p2);
		l.adicionaFim(p1);
		l.adicionarPorPosicao(p);
		
		System.out.println( l.imprimir() );
		
		l.removerFim();
		
		System.out.println( l.imprimir() );
		
		l.remover(1);
		
		System.out.println( l.imprimir() );
	}
}
