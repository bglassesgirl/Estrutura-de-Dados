package servicos;

public class JogoDaVelha {
	
	public void printTab(char[][] tab) {
	  System.out.println("--------------");
		
	   for (int l = 0; l < tab.length; l++) {
		   System.out.print("| ");
			  for (int c = 0; c < tab[l].length; c++) {
		       System.out.print(tab[l][c] + " | ");
			}
			  System.out.println();
			  System.out.println("--------------");
			
		  }
	}
	

	public  boolean hasWon(char[][] tab, char jogador) {
		//analisando as linhas
		for (int l = 0;l < tab.length; l++) {
			if (tab[l][0] == jogador && tab[l][1] == jogador && tab[l][2] == jogador) {
				return true;
			}
		}
		//analisando as colunas
		for (int c = 0; c < tab[0].length; c++) {
			if (tab[0][c] == jogador && tab[1][c] == jogador && tab[2][c] == jogador) {
				return true;
			}
		}
		if (tab[0][0] == jogador && tab[1][1] == jogador && tab[2][2] == jogador) {
			return true;
		}
		if (tab[0][2] == jogador && tab[1][1] == jogador && tab[2][0] == jogador) {
			return true;
		}
		return false;
	}
}
