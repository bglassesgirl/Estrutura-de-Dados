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
	
}
