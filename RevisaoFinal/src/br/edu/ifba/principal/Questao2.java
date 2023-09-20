package br.edu.ifba.principal;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		  Scanner in = new Scanner(System.in);
		  
		  System.out.println("Informe a quantidade que você recebe no total: ");
		  double salario = in.nextDouble();
		
		  double salarioMinino = 1320.00;
		  
		  System.out.println("Você ganha um total de : " + (salario/salarioMinino) + "Salário(s) mínimos");
		
		
	}
	
}
