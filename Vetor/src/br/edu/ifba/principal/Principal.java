package br.edu.ifba.principal;

import java.util.Arrays;
import java.util.Scanner;

import br.edu.ifba.servicos.Servicos;

public class Principal {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		Servicos s = new Servicos();
		
		for (int i = 0; i  < 10; i++) {
		    System.out.println("Digite 10 números para serem preenchidos no vetor");
			int a = in.nextInt();
			
			s.cadastrarVetor(a);
		}
		
		 System.out.println("Primeira lista: ");
		 s.listarVetor();
		 
		 System.out.println();
		 
		 int[] segundo = s.segundoVetor();
		 System.out.println("A segunda lista duplicada da primeira");
		 System.out.println(Arrays.toString(segundo));
		  
		/* for (int n : segundo) {
			System.out.print(Arrays.toString(new int [] {n}) + "");

			//System.out.print(n+ "");
		}*/
		 System.out.println();
		  
		 s.inverterVetor();
		 System.out.println("A primeira lista invertida: ");
		 s.listarVetor();
		 
		 System.out.println();
		 
		 int[] terceiro = s.somarArray(segundo);
		 System.out.println("O terceiro vetor, com a soma das duas primeiras listas: ");
		 System.out.println(Arrays.toString(terceiro));
	}
	
}
