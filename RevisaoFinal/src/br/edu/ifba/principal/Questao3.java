package br.edu.ifba.principal;

import java.util.Scanner;

public class Questao3 {
 
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do vetor: ");
		int tamanho = in.nextInt();
		
		int[] numeros = new int[tamanho];
		
		/*
		 * para preencher o valor poderia ser 
		 * 
		 * int[] numeros = {1,2,3,4,5,6,7,8,9,10];
		 * --> assim estou atribuindo valores a posicao do vetor
		 */
		
		
		System.out.println("Digite o valor mínimo do vetor: ");
		int mini = in.nextInt();
		
		System.out.println("Digite o valor maximo do vetor: ");
		int maxi = in.nextInt();
		
		
		for (int cont = mini; cont <= maxi; cont++ ) {
		       System.out.println(numeros[cont]);
		}
		
		
		
 	
	}
}
