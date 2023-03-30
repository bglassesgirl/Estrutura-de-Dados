package ultimasQuestoes;

import java.util.Arrays;

public class CadastrarConta {

	Conta[] conta = new Conta[10];
	int total = 0;

	public void adicionar(Conta c) {
		conta[this.total] = c;
		this.total++;
	}

	public void listar() {
		System.out.println(Arrays.toString(this.conta));

	}
	
	public Conta procurarPosicao(int p) {
		return this.conta[p];
	}

}
