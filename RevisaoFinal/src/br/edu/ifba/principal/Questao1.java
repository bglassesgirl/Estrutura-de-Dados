package br.edu.ifba.principal;

import java.util.Scanner;

public class Questao1 {

  public static void main(String[] args) {
	
	  Scanner in = new Scanner(System.in);
	  
	  System.out.println("Digite um n�mero inteiro: "); 
	  int numero = in.nextInt();
	  
	 System.out.println("O n�mero sucessor �: " + (numero+1)+ ", " 
	       + "e o n�mero antecesor �: " + (numero-1));
	  

  }
	
}
