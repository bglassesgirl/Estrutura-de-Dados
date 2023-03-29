package questao2;

import java.util.Scanner;

import questão1.NomeAluno;

public class Principal {

	
	Scanner in = new Scanner(System.in);
	
	private int[] numeros = new int[10];
		for (int cont = 0; cont < 10; cont++) {
		System.out.println("Digite o nome de DEZ alunos: ");
		int nu = in.nextInt();

		numeros.calculasOtimizado(nu);
		
	}
		
}
}
