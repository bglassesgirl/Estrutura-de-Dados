package br.edu.ifba.basicas;

public class Celula {

	private Celula proximo;
	private Celula anterior;
	private Object elemento;
	
	
	public Celula() {
		super();
	}

	public Celula(Celula proximo, Celula anterior, Object elemento) {
		super();
		this.proximo = proximo;
		this.anterior = anterior;
		this.elemento = elemento;
	}


	public Celula(Celula proximo, Object elemento) {
		super();
		this.proximo = proximo;
		this.elemento = elemento;
	}


	public Celula(Celula elemento) {
		super();
		this.elemento = elemento;
	}


	public Celula getProximo() {
		return proximo;
	}


	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}


	public Celula getAnterior() {
		return anterior;
	}


	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}


	public Object getElemento() {
		return elemento;
	}


	public void setElemento(Celula elemento) {
		this.elemento = elemento;
	}


       public void setElemento(Object elemento2) {
		this.elemento = elemento2;
	}
	
	
	
	
	
}
