package Servico;


public class ServicoLetraA {
     
	
	public String[] comecaComA(String[] vetor) {
		
		String[] novoVetor = new String[vetor.length];
		
		for(int cont = 0; cont < vetor.length; cont++) {
			if(vetor[cont].substring(0, 1).equalsIgnoreCase("a")){
				novoVetor[cont] = vetor[cont];
			}
		}
		
		return novoVetor;
	}
	
}
