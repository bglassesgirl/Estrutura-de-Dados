package ultimasQuestoes;

import java.util.Arrays;
import java.util.Scanner;

public class CadastrarConta {
	private Conta[] conta = new Conta[10];
    private int quant;

    
    public void adicionarConta(Conta nomeConta){
    	 this.conta[quant] = nomeConta;
         quant++;
        	 
         }
    public void cadastrarPessoas(Conta[] contas) {
    	Scanner in = new Scanner(System.in);
    	
    	for(int cont =0; cont < 3; cont++) {
    		Conta c = new Conta();
    		System.out.println("Digite o nome da contax "+(cont+1)+": ");
    		c.setNome(in.next());
    	    
    	    System.out.println("Digite o valor da contax "+(cont+1)+": ");
    	    c.setValor(in.nextDouble());
    	    
            this.adicionarConta(c);
    	}
    	
    }
    
    public void adicionarPosicao(Conta cc, int posicao){
    	if(!verificarPosicao(posicao)) {
    		throw new IllegalArgumentException("Posição Inválida");
    	}
				for(int cont = this.quant -1; cont >= posicao; cont--) {
				this.conta[cont+quant] = this.conta[cont];
			}
			this.conta[quant] = cc;
			this.quant++;
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
    	
    	for (int cont = 0; cont < this.quant; cont++) {
			if (nome.equalsIgnoreCase(this.conta[cont].getNome())) {
				c = this.conta[cont];
			}
		}
		return c;
		
     /*  for(Conta c : this.conta){
      	if(c == null) c{
      		continue;
       	}
      	else if(c.getNome().equalsIgnoreCase(nome)){
               return c;
            }
     }
      return null; */
    } 
    
    public boolean verificarPosicao(int posicao) {
    	//return posicao >= 0 %% posicao <=this.i;
   
    	if(posicao >= 0 && posicao <= this.quant) {
    		return true;
    	}else {
    		return false;
    	}
    }
	 
	}


