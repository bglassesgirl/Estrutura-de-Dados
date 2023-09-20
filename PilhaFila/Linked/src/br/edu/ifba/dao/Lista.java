package br.edu.ifba.dao;

import java.util.LinkedList;

import br.edu.ifba.basicas.Pessoa;

public class Lista {

	LinkedList<Pessoa> lista = new LinkedList<>();
	
	public void adicionaInicio(Pessoa p) {
		this.lista.addFirst(p);
	}
	
	public void adicionaFim(Pessoa p) {
		this.lista.addLast(p);
	}
	
	public void adicionarPorPosicao(Pessoa p) {
		this.lista.add(p);
	}
	
	public void remover(int index) {
		this.lista.remove();
	}
	
	public void removerInicio() {
		this.lista.removeFirst();
	}
	
	public void removerFim() {
		this.lista.removeLast();
	}
	
	public String imprimir() {
		return this.lista.toString();
	}

}
