package principal;

import java.util.Scanner;

import Servico.ServicoResto;

public class PrincipalResto {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		ServicoResto resto = new ServicoResto();

		// int um = in.nextInt();
		// int dois = in.nextInt();

		// System.out.println("O resto da divis�o dos dois numeros �: " +
		// Servico.numeros(um, dois));

		System.out.println("O resto da divis�o dos dois numeros �: " + resto.numeros(in.nextInt(), in.nextInt()));

	}
}
