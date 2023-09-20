package servicos;

import java.util.Random;

public class ServicoJogoAleatorio {

	Random random = new Random();

	int[] numeros = new int[2];
	int tamanho = 0;
	int aleatorio = random.nextInt(99);
	
	
	public int mostrarTotal() {
		return this.tamanho;
	}
	
	public String intervaloAleatorio(int n) {
		if (this.tamanho == this.numeros.length) {
			aumentaVetor();
		} 
		if (this.aleatorio > n) {
			this.numeros[tamanho] = n;
			this.tamanho++;
			return "Número aleátorio MAIOR que o inserido!!";
		}else if (this.aleatorio < n) {
			this.numeros[tamanho] = n;
			this.tamanho++;
			return "Número aleátorio MENOR que o inserido!!";
		}else {
			this.numeros[tamanho] = n;
			this.tamanho++;
			return "Parabéns, você acertou!";
		}
	}
    

	private void aumentaVetor() {
		// TODO Auto-generated method stub
		int[] novoVetor = new int[this.numeros.length*2];
		System.arraycopy(this.numeros, 0, novoVetor, 0, this.numeros.length);
	    this.numeros = novoVetor;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.numeros[i]);
			s.append(" ,");
		}
		if (this.tamanho > 0) {
			s.append(this.numeros[this.tamanho - 1]);

		}
		s.append("]");
		return s.toString();
	}

}
