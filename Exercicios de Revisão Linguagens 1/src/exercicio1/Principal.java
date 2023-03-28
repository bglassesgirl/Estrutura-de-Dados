package exercicio1;

import java.util.Scanner;

public class Principal {
	
public static void main(String[] args) {
		
		Scanner in  = new Scanner (System.in);
		
		System.out.println(" Digite um número: ");
		int numero = in.nextInt();
		 
	     int numero2 = 1;
		 while(numero2 <=10 ) {
			 System.out.println(numero+" x "+numero2+" = "+Servico.multiplicacao(numero, numero2));
			 numero2++;
		 }
		
	}
	
}
