package estruturadados.vetor.teste;

import estruturadados.vetor.Vetor;

//verificar tamanho real de um vetor e imprimir seus elementos
public class Aula4 {

	public static void main(String[] args) {
	
		
		
		Vetor vetor = new Vetor(10);
       
		
		vetor.adicionaBoolean("elemento 1");
		vetor.adicionaBoolean("elemento 2");
		vetor.adicionaBoolean("elemento 3");
		
		System.out.println(vetor.tamanho());
		
		System.out.println(vetor.toString());
	}

}
