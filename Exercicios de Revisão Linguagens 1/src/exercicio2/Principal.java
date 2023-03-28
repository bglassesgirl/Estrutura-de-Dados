package exercicio2;

import java.util.Scanner;

import exercicio2.Servico;

public class Principal {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);


		System.out.println("Digite duas variável: (Para fazer um operação entre elas) ");
		double v1 = in.nextDouble();
		double v2 = in.nextDouble();
		

		System.out.println("Qual operação você quer fazer? (Escolha entre: +, -, / e *, sendo adição, subtração, divisão ou multiplicação, respectivamente): ");
		char operacao = in.next().charAt(0);

		System.out.println(	"O resultado da operação com as duas variáveis fornecidas e com o tipo de operação escolhida foi: "+ Servico.continha(operacao, v1, v2));

	}

}
