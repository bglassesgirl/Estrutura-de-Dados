package br.edu.ifba.lista;
import br.edu.ifba.basicas.Celula;

public class Lista {

	private Celula primeira;
	private Celula ultima;
	
	private int totalElementos = 0;
	
	
	public void adicionarNoComeco(Object elemento) {
		
           Celula novaCelula = new Celula (this.primeira, elemento);
           this.primeira = novaCelula;
              
           if (totalElementos == 0) {
			    this.ultima = novaCelula;
		}
           this.totalElementos++;
	}
	
	public void listar() { 
		Celula auxiliar = this.primeira;
		for (int i = 0; i < this.totalElementos-1; i++) {
		     System.out.println(auxiliar.getElemento()+" - ");
			 auxiliar = auxiliar.getProxima();
		}
		System.out.println(auxiliar.getElemento());
	}
	public void adicionarNoFinal(Object elemento) {
		
		if (totalElementos == 0) {
			this.adicionarNoComeco(elemento);
		} else {
			Celula celulaNova = new Celula(elemento);
			this.ultima.setProxima(celulaNova);
			this.ultima = celulaNova;
			this.totalElementos++;
		}
	}
	
	public void adicionarPorPosicao(int posicao, Object elemento) {

		if (posicao == 0) {
			this.adicionarNoComeco(elemento);

		} else if (posicao == this.totalElementos) {
			this.adicionarNoFinal(elemento);
			
		} else {
			
		    Celula auxiliar = this.primeira;
		    for (int i = 0; i < posicao-1; i++) {
				auxiliar = auxiliar.getProxima();
			
			}
		    Celula novaCelula = new Celula(auxiliar.getProxima(), elemento);
		    auxiliar.setProxima(novaCelula);
		    this.totalElementos++;
		}
	}

   public void removeDoComeco() {
		
		Celula aux = this.primeira;
		this.primeira = this.primeira.getProxima();

		aux.setProxima(null);
		totalElementos--;

	}
	
    public void removeFinal() {

    	Celula remove = this.primeira;
    		for (int i = 0; i < this.totalElementos - 2; i++) {
    			remove = remove.getProxima();
    		}
    		
    		remove.setProxima(null);
    		this.ultima = remove;
    		this.totalElementos--;
    	}
    

	public void removePosicao (int pos) {			
		
		if (pos == 0) {
			this.removeDoComeco();
			
		}else if (pos == this.totalElementos) {
			this.removeFinal();;
		
		}else {		
	
			Celula anterior = this.primeira;
			for (int i = 0; i < pos - 1; i++) {
				anterior = anterior.getProxima();
			}
			
			anterior.setProxima(anterior.getProxima().getProxima());
			anterior.getProxima();
			this.totalElementos--;
		
		}				
	}	

}
}
