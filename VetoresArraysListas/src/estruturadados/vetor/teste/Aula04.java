package estruturadados.vetor.teste;

import estruturadados.vetor.Vetor;

public class Aula04 {
  
	//verificar tamanho real de um vetor e imprimir seus elementos
	public static void main(String[] args) {
	
		Vetor vetor = new Vetor(10);
       
		
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		
		System.out.println(vetor.tamanho());
		
		System.out.println(vetor.toString());
	}

    /*
    * //simplesmente imprime o tamanho do vetor
	public int tamanho() {
		return this.tamanho;
	}
	/*
	 * vai passar um vetor de elementos e retorna todos os elementos do array
	 * e mostrar apenas os elementos preenchidos do array da maneira 
	 * mais eficiente e elegante com a classe string builder 
	 * 
	 * 
	 * 
	 * public String toString() {
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
	
	 */

	
	
	
	
}
