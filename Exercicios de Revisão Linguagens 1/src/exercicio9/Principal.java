package exercicio9;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o n�mero correspondente a um m�s: ");
		int numero = scan.nextInt();

		System.out.println("O m�s correspondente ao n�mero que voc�e digitou �:  " + Servico.meses(numero));

	}

}
