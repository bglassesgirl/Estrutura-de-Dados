package estruturadados.vetor.teste;

import estruturadados.vetor.Vetor;

public class Aula05 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");

		
		System.out.println(vetor.busca(2));
	}
	
	/*
	 * ter acesso a todas as opções que nao podem ser
	 * alteradadas(if) e quando isso acontecer vai jogar
	 * uma excessao
	 * public String busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}// se cair numa opcao que tem no vetor, retorna o elemento desajado
		return this.elementos[posicao];
	}
	 */
	
}
