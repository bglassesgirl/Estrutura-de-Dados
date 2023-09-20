package servico;

public class ServicoArrayInteiro {

	private int[] inteiro = new int[4];
	private int tamanho = 0;
	
	
	public void adicionar(int numero) {
		this.inteiro[this.tamanho] = numero;
		this.tamanho++;
	}
	
	public int segundoMaior() {
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < inteiro.length; i++) {
			if(a < this.inteiro[i]) {
				a = this.inteiro[i];
			}
		}
		
		for (int cont= 0; cont < inteiro.length; cont++) {
			if(b < this.inteiro[cont] && this.inteiro[cont] != a) {
				b = this.inteiro[cont];
			}
		}
		return b;
	}
	
	
}
