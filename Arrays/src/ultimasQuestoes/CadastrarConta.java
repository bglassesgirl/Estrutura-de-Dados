package ultimasQuestoes;

import java.util.Arrays;

public class CadastrarConta {
	private Conta[] conta = new Conta[10];
    private int i;
    private int ii;

    
    public void adicionarConta(Conta conta){
         this.conta[i] = conta;
         i++;
    }
    
    public void adicionarPosicao(Conta cc, int posicao){
    	if(!verificarPosicao(posicao)) {
    		throw new IllegalArgumentException("Posição Inválida");
    	}
    		ii = i;
				for(int cont = this.i -1; cont >= posicao; cont--) {
				this.conta[cont+i] = this.conta[cont];
			}
			this.conta[i] = cc;
			this.i++;
    }
    
    public void listarConta(){
        //return this.conta;
    	System.out.println(Arrays.toString(this.conta));
    }
    
    public Conta procurarConta(int i){
    	if(!verificarPosicao(i)) {
        	throw new IllegalArgumentException("Posição Inválida");
    	}
    	return conta[i-1];
    }
    
    public Conta procurarNome(String nome){
    	Conta c = null;
    	
    	for (int cont = 0; cont < this.i; cont++) {
			if (nome.equalsIgnoreCase(this.conta[cont].getNome())) {
				c = this.conta[cont];
			}
		}
		return c;
		
 //       for(Conta c : this.conta){
 //       	if(c == null) {
 //        		continue;
//        	}
 //       	else if(c.getNome().equalsIgnoreCase(nome)){
 //               return c;
//            }
 //       }
 //       return null;
    }
    
    public boolean verificarPosicao(int posicao) {
    	//return posicao >= 0 %% posicao <=this.i;
   
    	if(posicao >= 0 && posicao <= this.i) {
    		return true;
    	}else {
    		return false;
    	}
    }
	 
	}


