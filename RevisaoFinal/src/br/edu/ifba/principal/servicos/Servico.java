package br.edu.ifba.servicos;

public class Servico {

	int[] vetorNovo = new int[5];
	
	public int[] encontrarIntervalo(int[] a, int min, int max) {
		int tamanho = 0; 
		for (int i = 0; i < a.length; i++) {
			if ((a[i] >= min) && (a[i] <=max)) {
				vetorNovo[tamanho] = a[i];
				tamanho++;
			}
		}
		return vetorNovo;
	}
}
