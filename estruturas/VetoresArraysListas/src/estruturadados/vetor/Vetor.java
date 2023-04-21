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

	/*
	 * adicionar um elemento no vetor buscando os elementos e verificar se o vetor
	 * tem posição uma posicao null, se sim, está disponivel para adionar o
	 * elemento(if)
	 */
	public void adicionaPorPosicao(String elemento) {
		for (int i = 0; i < this.elementos.length; i++) {
			if (this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}

	/*
	 * adiciona a apartir do ultimo elemento adicionado vericando (if) se o tamanho
	 * é menor que a capacidade do vetor eu consigo adicionar mais elementos no
	 * vetor se nao, vai jogar um exceção
	 */
	public void adiciona(String elemento) throws Exception {
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} else {
			throw new Exception("Vetor já está cheio, não é possivel adiconar mais");
		}
	}

	public boolean adicionaBoolean(String elemento) {
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	
	//simplesmente imprime o tamanho do vetor
	public int tamanho() {
		return this.tamanho;
	}
	
	
	/*
	 * vai passar um vetor de elementos e retorna todos os elementos do array
	 * e mostrar apenas os elementos preenchidos do array da maneira 
	 * mais eficiente e elegante com a classe string builder 
	 */
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		 for (int i=0; i<this.tamanho-1; i++) {
			 s.append(this.elementos[i]);
			 s.append(" ,");
		 }
		if (this.tamanho>0) {
			 s.append(this.elementos[this.tamanho-1]);
			
		}
         s.append("]");
         return s.toString();
	}
	
}
