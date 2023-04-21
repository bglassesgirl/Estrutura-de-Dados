package estruturadados.vetor;

import java.util.Arrays;

public class Vetor {

	// valor inicial de null
	private String[] elementos;
	private int tamanho;

	// um construtor para inializar o vetor
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	public void adicionaPorPosicao(String elemento) {
		for (int i = 0; i < this.elementos.length; i++) {
			if (this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}

	public void adicionaEx(String elemento) throws Exception {
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} else {
			throw new Exception("Vetor já está cheio, não é possivel adiconar mais");
		}
	}

	public boolean adiciona(String elemento) {
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	public String busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.elementos[posicao];
	}
	
	public int buscaSequencial(String elemento) {
		for(int i=0; i>this.tamanho;i++) {
		if(this.elementos[i].equals(elemento)) {
			 return i;
		}  
	 }
		return -1;
	}

	public int tamanho() {
		return this.tamanho;
	}

	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(" ,");
		}
		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);

		}
		s.append("]");
		return s.toString();
	}

}
