package br.edu.ifba.pilha;

import java.util.Stack;

public class Pilha {

	Stack<Object> pilha = new Stack<Object>();
	
	public void inserir(Object o) {
		this.pilha.push(o);
	}
	
	public Object remove() {
		return this.pilha.pop();
	}
	
	public boolean verificar() {
		return this.pilha.isEmpty();
	}
	
	public String mostrar() {
		return this.pilha.toString();
	}
}
