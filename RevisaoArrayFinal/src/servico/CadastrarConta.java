package servico;

import java.util.Arrays;

import basicas.Conta;

public class CadastrarConta {

	Conta[] conta = new Conta[5];
    private int tamanho = 0;
    
    public String listarConta () {
    	 return Arrays.toString(this.conta);
    	 
    	 //System.out.println(Arrays.toString(this.conta));
    	 //assinatura void
    }
    
    public void adicionarConta(Conta a) {
    	aumentarVetor();
    	this.conta[this.tamanho] = a;
    	this.tamanho++;
    	
    }
    
    public void adicionarContaPorPosicao(Conta a, int posicao) {
    	aumentarVetor();
    	for(int cont = this.tamanho-1; cont >= posicao; cont--) {
    		this.conta[cont+1] = this.conta[cont];
    	}
    	this.conta[posicao] = a;
    	this.tamanho++;
    	
    }
   
    public void removerContaPorPosicao( int posicao) {
    	for (int cont = posicao; cont < this.tamanho-1; cont++) {
    		this.conta[cont] = this.conta[cont+1];
    	}
    	 this.conta[this.tamanho-1] = null;
    	 this.tamanho--;
    }

    public Conta procurarContaPorNome(String nome) {
    	for(int cont = 0; cont <= this.tamanho; cont++) {
    		  if(this.conta[cont].getNome().equals(nome)) {
    			  return this.conta[cont];
    		  } //melhor colcoar ignore case
    	}
    	return null;
	}

    public Conta procurarConta(int posicao) {
    	return this.conta[posicao];
    }
    
	private void aumentarVetor() {
		if (this.conta.length == this.tamanho) {
			                             //ppode ser this.conta.lenght *2
			Conta[] contaNova = new Conta[this.tamanho *2];
			System.arraycopy(conta[0], 0, contaNova, 0, this.conta.length);
			this.conta = contaNova;
		}
	}
}
