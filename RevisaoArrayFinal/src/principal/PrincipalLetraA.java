package Principal;

import Servico.ServicoLetraA;

public class PrincipalLetraA {


	public static void main(String[] args) {
		
		String[] vetor = {"Luana", "Ana", "Aplle", "Alface", "Maria"};
	
		ServicoLetraA i = new ServicoLetraA();
	
		
		//chmar metodo comecaComA
		String[] novoVetor = i.comecaComA(vetor);
		
		      /*
		       * percore cada alemento do array novoVetor 
		       * e atribui cada elemento a variavel str
		       * e o if verifica se nao é nulo
		       */
		
		for(String str : novoVetor) {
			if (str != null) {
				System.out.println(str);
			}
		}
	
		
	}
	
}
