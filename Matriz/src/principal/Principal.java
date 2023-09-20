package principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int matriz[][] = new int[3][3];

		String linha1;

		Scanner in = new Scanner(System.in);

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				matriz[linha][coluna] = in.nextInt();
			}
		}

		for (int linha = 0; linha < matriz.length; linha++) {
			linha1 = "";
			for (int coluna = 0; coluna < matriz[0].length; coluna++) {
				if (coluna == 0) {
					linha1 += "|" + matriz[linha][coluna] + "|";
				}
				if ((coluna > 0) && (coluna < matriz[0].length)) {
					linha1 += matriz[linha][coluna] + "|";

				}

			}
			System.out.println(linha1);
	}

	}

}
