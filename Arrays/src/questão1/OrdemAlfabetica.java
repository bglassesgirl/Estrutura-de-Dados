package questão1;

import java.util.Arrays;

public class OrdemAlfabetica {

	private NomeAluno[] nome = new NomeAluno[10];
	
	int cont = 0;
	
	public void cadastroOtimizado(NomeAluno nome) {
		this.nome[cont] = nome;
		this.cont++;
		
	}
	
	public NomeAluno[] retornoNome() {
		Arrays.sort(this.nome);
		return this.nome;
		
	}

	
	
}
