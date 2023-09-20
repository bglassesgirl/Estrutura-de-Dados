package servico;

public class Servico {

	private int[] binario = new int[4];
	private int tamanho = 0;
	
	
	public void adicionar(int numero) {
		this.binario[this.tamanho] = numero;
		tamanho++;
	}
	
	public int converterBinario() {
		int continha;
		int result = 0;
		int a = this.binario.length;
		
		for (int i = 0; i < this.binario.length; i++) {
			continha = (int) (binario[i] * Math.pow(2, a -1));
			System.out.println(continha);
			result = result + continha;	
			a--;
		}
		return result;
	}
	
}



