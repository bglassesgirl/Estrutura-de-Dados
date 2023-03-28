package exercicio6;

import java.util.Scanner;

import exercicio6.Servico;

public class Principal {

public static void main(String[] args) {
		
		Scanner scan  = new Scanner (System.in);
		
		System.out.println("Quantas horas você trabalha?  ");
		int numero = scan.nextInt();
		 
		System.out.println(" " + Servico.salario(numero));
		
	}
	
	
}
