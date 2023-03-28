package exercicio9;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o número correspondente a um mês: ");
		int numero = scan.nextInt();

		System.out.println("O mês correspondente ao número que vocêe digitou é:  " + Servico.meses(numero));

	}

}
