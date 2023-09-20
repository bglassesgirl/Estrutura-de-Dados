package br.edu.ifba.principal;

import java.util.Scanner;

public class Questao3 {
 
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do vetor: ");
		int tamanho = in.nextInt();
		
		int[] numeros = new int[tamanho];
		
		Servico s = new Servico();
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = in.nextInt();
		}
	
		System.out.println("Digite o valor mínimo do vetor: ");
		int mini = in.nextInt();
		
		System.out.println("Digite o valor maximo do vetor: ");
		int maxi = in.nextInt();
		
		/*
		for (int cont = mini; cont <= maxi; cont++ ) {
		       System.out.println(numeros[cont]);
		}
		 */
		
		int[] vetor = s.encontrarIntervalo(numeros, mini, maxi);
		
		System.out.println(Arrays.toString(vetor));
		System.out.println(Arrays.toString(s.encontrarIntervalo(vetor, in.nextInt(), in.nextInt())));
 	
	}
}
