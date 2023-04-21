package estruturadados.vetor.teste;

import estruturadados.vetor.Vetor;

// adiciona elementos no final do vetor
public class Aula03 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(5);

		// essa opcao para usar o metodo que volta uma excecao
		/*
		 * try { vetor.adiciona("elemento 1"); vetor.adiciona("elemento 2");
		 * vetor.adiciona("elemento 3"); } catch (Exception e) { e.printStackTrace(); }
		 */

		vetor.adicionaBoolean("Aprendendo Estrutura de Dados");
		vetor.adicionaBoolean("Com Loiane Groner");

	}

}
