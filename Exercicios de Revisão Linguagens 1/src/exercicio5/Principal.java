package exercicio5;

import java.util.Scanner;

public class Principal {


	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Digite um número de 0 a 9: ");
		int numero  = in.nextInt();
		
		
		Servico.par(numero);
        Servico.primo(numero);
	

	}

	
	
}
