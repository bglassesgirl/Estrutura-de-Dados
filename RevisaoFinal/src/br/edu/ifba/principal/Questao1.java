package br.edu.ifba.principal;

import java.util.Scanner;

public class Questao1 {

  public static void main(String[] args) {
	
	  Scanner in = new Scanner(System.in);
	  
	  System.out.println("Digite um número inteiro: "); 
	  int numero = in.nextInt();
	  
	 System.out.println("O número sucessor é: " + (numero+1)+ ", " 
	       + "e o número antecesor é: " + (numero-1));
	  

  }
	
}
