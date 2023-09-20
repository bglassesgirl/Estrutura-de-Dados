package br.edu.ifba.servicos;

import java.util.Arrays;

public class Servicos {
	
	int[] vetor = new int[10];
	int tamanho = 0;

	//adicionar elemento no vetor
	public void cadastrarVetor(int e) {
		this.vetor[this.tamanho] = e;
		this.tamanho++;
	}
	
	//lista a quantidade de elementos adicionados no vetor
	public void listarVetor() {
	//System.out.println(Arrays.toString(this.vetor));
		System.out.println(Arrays.toString(Arrays.copyOfRange(this.vetor, 0, this.tamanho)));
	}
	
	 //duplicar o segundo vetor 
     public int[] segundoVetor() {
    	 int[] vetorNovo = new int[this.vetor.length];
    	 for (int i = 0; i < vetor.length; i++) {
    		 vetorNovo[i] = this.vetor[i];
		}
		return vetorNovo;
     }
     
     //metodo que inverte as posicoes dos vetores
     public void inverterVetor() {
    	 int inicio = 0;
    	 int fim = tamanho - 1;
    	 
    	 while (inicio < fim) {
    		 int temp = vetor[inicio];
    		 vetor[inicio] = vetor[fim];
    		 vetor[fim] = temp;
    		 
    		 inicio++;
    		 fim--;
    	 }
     }
     
     //cria um terceiro array retornando a soma dos elementos correspondentes dos 2 primerios
     public int[] somarArray( int[] b ) {
    	 int[] terceiro = new int[this.tamanho];
    	 
    	 for (int i = 0; i < this.tamanho; i++) {
			terceiro[i] = this.vetor[i] + b[i];
		}
    	 return terceiro;
     }
     
}
