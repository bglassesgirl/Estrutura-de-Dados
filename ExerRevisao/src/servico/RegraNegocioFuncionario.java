package servico;

import java.util.Arrays;

import basicas.Funcionario;

public class RegraNegocioFuncionario {

	
	Funcionario[] fun = new Funcionario[3];
	private int tamanho = 0;
	

	public void cadastrarFuncionario(Funcionario f) {
		this.fun[this.tamanho] = f;
		this.tamanho++;
				
	}
	
	public String listarFuncionario() {
		return Arrays.toString(this.fun);
	}
	
	   
		public Funcionario procurarfunresa(int posicao) {
			return this.fun[posicao];
		}
		
		public void adicionarfunresaPorPosicao(int posicao, Funcionario e) {
			aumentaVetorfunresa();
			for (int i = this.tamanho-1; i >=  posicao; i--) {
				this.fun[i+1] = this.fun[i];
				
			}
			this.fun[posicao] = e;
			this.tamanho++;
		}
		 
		
		public void removerEmrpesaPorPosicao(int posicao) {
			aumentaVetorfunresa();
			for (int i = posicao; i < this.tamanho; i++) {
				this.fun[i] = this.fun[i-1];
			}
			this.fun[posicao-1] = null;
			this.tamanho--;
		}
		
		private void aumentaVetorfunresa () {
			if (this.tamanho == this.fun.length) {
				
				Funcionario[] novafun = new Funcionario[this.fun.length *2];
				System.arraycopy(this.fun,0, novafun, 0, this.fun.length);
				this.fun = novafun;
			}
		}
	
}
