package principal;

import java.util.Scanner;

import servicos.JogoDaVelha;

public class MainJogoDaVelha {
	  public static void main(String[] args) {
	        
	    	char[][] tabuleiro = new char[3][3];
	        char jogadorAtual = 'X';
	        boolean jogoAcabou = false;
	        
	        Scanner scan = new Scanner(System.in);
	        JogoDaVelha s = new JogoDaVelha();
	        
	        s.inicializarTabuleiro(tabuleiro);

	        while (!jogoAcabou) {
	            s.desenharTabuleiro(tabuleiro);

	            System.out.print("Jogador " + jogadorAtual + ", escolha a linha (1-3): ");
	            int linha = scan.nextInt() - 1;

	            System.out.print("Jogador " + jogadorAtual + ", escolha a coluna (1-3): ");
	            int coluna = scan.nextInt() - 1;
	            
	            if (tabuleiro[linha][coluna] != ' ') {
	                System.out.println("Posição ocupada, escolha outra posição.");
	                continue;
	            }

	            tabuleiro[linha][coluna] = jogadorAtual;

	            if (s.verificarVitoria(tabuleiro, jogadorAtual)) {
	            	s.desenharTabuleiro(tabuleiro);
	            	System.out.println("Jogador " + jogadorAtual + " venceu!");
	                jogoAcabou = true;
	            } else if (s.verificarEmpate(tabuleiro)) {
	                System.out.println("Empate!");
	                jogoAcabou = true;
	            }

	            if (jogadorAtual == 'X') {
	            	  jogadorAtual = 'O';
	            	} else {
	            	  jogadorAtual = 'X';
	            	}
	        }
	        
	        scan.close();
	    }
}
