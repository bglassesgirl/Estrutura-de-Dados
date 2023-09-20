package br.edu.ifba.fila;

import java.util.Queue;
import java.util.LinkedList;

public class Fila {

	Queue<Object> fila = new LinkedList<Object>();
			
	public void inserir(Object o) {
		this.fila.add(o);
	}
	
	public Object remover() {
		return this.fila.remove();
	}
	
	public boolean verificar() {
		return this.fila.isEmpty();
	}
	
	public String mostrar() {
		return this.fila.toString();
	}
	
}
