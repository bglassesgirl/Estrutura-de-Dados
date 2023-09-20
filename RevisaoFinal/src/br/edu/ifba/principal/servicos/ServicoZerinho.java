package br.edu.ifba.servicos;

public class ServicoZerinho {
     
	public String verificarZerinho( int[] jogadas) {
		
		if ((jogadas[0]==jogadas[1]) && (jogadas[0]==jogadas[2])) {
			return "Jogo empatadado!";
		}else if ((jogadas[0]!=jogadas[1]) && (jogadas[0]!=jogadas[2])) {
			return "Jogador A, ganhou!";
		}else if ((jogadas[1]!=jogadas[0]) && (jogadas[1]!=jogadas[2])) {
			return "Jogador B, ganhou!";
		}else {
			return "Jogador C, ganhou!";
		}
	}
}
