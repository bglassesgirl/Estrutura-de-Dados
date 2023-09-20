package estruturadados.vetor.teste;

import estruturadados.vetor.Vetor;

public class Aula03 {

	public static void main(String[] args) {

		// adiciona elementos no final do vetor

		Vetor vetor = new Vetor(5);

		// essa opcao para usar o metodo que volta uma excecao
		/*
		 * try { vetor.adiciona("elemento 1"); vetor.adiciona("elemento 2");
		 * vetor.adiciona("elemento 3"); } catch (Exception e) { e.printStackTrace(); }
		 */

		vetor.adiciona("Aprendendo Estrutura de Dados");
		vetor.adiciona("Com Loiane Groner");

	}

	/*
	 *
	 *adicionar um elemento no vetor buscando os elementos e verificar se o vetor
	 * tem posição uma posicao null, se sim, está disponivel para adionar o
	 * elemento(if)
	 * public void adicionaPorPosicao(String elemento) {
		for (int i = 0; i < this.elementos.length; i++) {
			if (this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}
	 * 
	 * adiciona a apartir do ultimo elemento adicionado vericando (if) se o tamanho
	 * é menor que a capacidade do vetor eu consigo adicionar mais elementos no
	 * vetor se nao, vai jogar um exceção
	 * 
	 * public void adicionaEx(String elemento) throws Exception {
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} else {
			throw new Exception("Vetor já está cheio, não é possivel adiconar mais");
		}
	}

	public boolean adiciona(String elemento) {
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
}
