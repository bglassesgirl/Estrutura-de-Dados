package estruturadados.vetor.teste;

import estruturadados.vetor.Vetor;

public class Aula07 {
	
	
	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("D");
		vetor.adiciona("E");
		vetor.adiciona("G");
		
		System.out.println(vetor);
		
		vetor.adiciona(0, "A");
		
		System.out.println(vetor);
		
		
	    vetor.adiciona(3, "L");
		
		System.out.println(vetor);
	}
	
	
	
	
	
	
	
	/*
	 * sobrecarregar o metodo adiciona modificando a sua assinatura 
	 * -1° verifica se a posicao que que quer ser adicionada existe ou nao com o if
	 * -2° pra mover os elementos usa um for pra iterar o vetor
	 * -3° atribuir o elemento pra posicao
	 * 
	 * 
	 * public boolean adiciona(int posicao, String elemento) {
	
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
	 * -o i vai do tamanho ate a posicao, ent o i vai ter o tamanho 
	 * -e o i ela é maior ou igual ou maior que a posicao que esta sendo passada
	 * 
	 * 
	 * - verificaa todos os elementos
	 * for (int i=this.tamanho-1; i>=posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		} //- atribuir o elemento para a posicao
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return false;
	}
	 */
	
	
}
   