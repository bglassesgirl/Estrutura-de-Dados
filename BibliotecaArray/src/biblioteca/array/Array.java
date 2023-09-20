package biblioteca.array;

import java.util.Arrays;

public class Array<T> {


	Object[] conta = new Object[2];
	int total = 0;

	
	public void adicionar(T c) {
		aumentaVetor();
		conta[this.total] = c;
		this.total++;
	}
	
	public int totalObjects() {
		return this.total;
	}

	public void adicionarPorPosicao(int posicao, T cc) {
		aumentaVetor();
		if (!verificaPosicao(posicao)) {
			throw new IllegalArgumentException("posição inválida!");
		}
		for (int cont = this.total - 1; cont >= posicao; cont--) {
			this.conta[cont + 1] = this.conta[cont];
		}
		this.conta[posicao] = cc;
		this.total++;
	}
	

	public void listar() {
		System.out.println(Arrays.toString(this.conta));

	}

	public Object procurarPosicao(int p) {
		if (!verificaPosicao(p)) {
			throw new IllegalArgumentException("posição inválida!");
		}

		return this.conta[p];
	}


	private boolean verificaPosicao(int posicao) {
		return posicao >= 0 && posicao <= this.total;
	}
	
	private void aumentaVetor() {
		
		if(this.total == this.conta.length){
			Object[] newObject = new Object[this.conta.length*2];
			System.arraycopy(this.conta, 0, newObject, 0, this.conta.length);
			this.conta = newObject;
		}
	}

	
	public void remover(int posicao) {
		if(!verificaPosicao(posicao)) {
			throw new IllegalArgumentException("posição inválida!");
		}         //ou pode colocar aqui >= que funciona como  null
		aumentaVetor();
		
	   for (int cont = posicao; cont<this.total; cont++) {
	    	 this.conta[cont] = this.conta[cont++];
	     }
	     this.conta[this.total-1] = null;
	     this.total--;
	}

}

