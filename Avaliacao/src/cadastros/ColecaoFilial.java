package cadastros;

import java.util.Arrays;

import basicas.Filial;

public class ColecaoFilial {

	Filial[] filial = new Filial[5];
	private int tamanho = 0;
	
	
	public void cadastrarFilial(Filial f ) {
		this.filial[this.tamanho] = f;
		tamanho++;
		
	}
	
	public void cadastrarFilialPorPosicao(Filial a, int posicao) {
		for (int i = this.tamanho-1; i >= posicao; i--) {
			this.filial[i+1] = this.filial[i];
		}
		 this.filial[posicao] = a;
		 posicao++;
	}
	
	public String listarFilial() {
		return Arrays.toString(this.filial);
	}
	
	
	public Filial procurarFilialPorNome(String nome) {
		for (int i = 0; i <= this.tamanho; i++) {
			if (this.filial[i].getNome().equalsIgnoreCase(nome)) {
				return this.filial[i];
			}
		}
		return null;
	}
	
	public void removerFilialPorPosicao(int posicao) {
		aumentaVetorfilial();
		for (int i = posicao; i <= this.tamanho-1; i++) {
			this.filial[i] = this.filial[i+1];
		}
		this.filial[this.tamanho-1] = null;
		this.tamanho--;
	}
	
	
	private void aumentaVetorfilial() {
               if (this.tamanho == this.filial.length) {
				
                 Filial[] novofilial = new Filial[this.tamanho*2];  
            	 System.arraycopy(filial, 0, novofilial, 0, this.filial.length);
            	 this.filial = novofilial;
			}

		
	}
}
