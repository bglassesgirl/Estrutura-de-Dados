package exercicio2;

import java.util.Scanner;

import exercicio2.Servico;

public class Principal {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);


		System.out.println("Digite duas vari�vel: (Para fazer um opera��o entre elas) ");
		double v1 = in.nextDouble();
		double v2 = in.nextDouble();
		

		System.out.println("Qual opera��o voc� quer fazer? (Escolha entre: +, -, / e *, sendo adi��o, subtra��o, divis�o ou multiplica��o, respectivamente): ");
		char operacao = in.next().charAt(0);

		System.out.println(	"O resultado da opera��o com as duas vari�veis fornecidas e com o tipo de opera��o escolhida foi: "+ Servico.continha(operacao, v1, v2));

	}

}
