package br.edu.br.lista;

import br.edu.ifba.basicas.Celula;

public class Lista {

	private Celula primeira;
    private Celula ultima;
    int totalElementos = 0;
        
    public void adicionarNoComeco(Object elemento) {
		if (totalElementos == 0) {
			Celula novaCelula = new Celula(this.primeira, elemento);
			this.primeira = novaCelula;
			this.ultima = novaCelula;
			this.totalElementos++;
			
		} else {
			Celula novaCelula = new Celula(this.primeira, elemento);
			this.primeira.setAnterior(novaCelula);
			this.primeira = novaCelula;
			this.totalElementos++;
		}
		
	}
      
    
    public String imprimir() {
    	
    	if (this.totalElementos == 0) {
			return "[]";
		}
    	StringBuffer lista = new StringBuffer();
    	Celula nova = this.primeira;
    	lista.append("[");
    	
    	for (int i = 0; i < this.totalElementos-1; i++) {
			lista.append(nova.getElemento());
			lista.append(", ");
			nova = nova.getProximo();
		}
      lista.append(nova.getElemento());
      lista.append("]");
      return lista.toString();
    }
         
    
    
    
    
    
    
    
    
    
    
    }
	
	
	

