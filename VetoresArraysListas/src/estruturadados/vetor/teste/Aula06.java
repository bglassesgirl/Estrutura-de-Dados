package estruturadados.vetor.teste;

import estruturadados.vetor.Vetor;

public class Aula06 {
	
	
	//verificar se um elemento existe no vetor
	public static void main(String[] args) {
		
		
       Vetor vetor = new Vetor(10);
		
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");

		
	   System.out.println(vetor.buscaSequencial("elemento 1"));
		
		
	}
	
	/*
	 * de posicao em posicao vai vericar se o elemento é o que estamos procurando
	 * se for, retorn true. e ele itera(for) todo o vetor
	 * 
	 * como o vetor é String usa o equals ou equals ignore case 
	 * 
	 * 
	 * 	public int buscaSequencial(String elemento) {
		for(int i=0; i>this.tamanho;i++) {
		if(this.elementos[i].equals(elemento)) {
			 return i;
		}  
	 }
		return -1;
	}
	 * 
	 * 
	 */
	
}
