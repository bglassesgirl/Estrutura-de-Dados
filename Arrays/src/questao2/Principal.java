package questao2;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {

	Scanner in = new Scanner (System.in);
	
	SomarValor soma = new SomarValor();
	int[] numeros = new int[10];
	
	for(int i =0; i<numeros.length; i++) {
		numeros[i] = in.nextInt();
	}
	
	 System.out.println(soma.somar(numeros));
 }
}
