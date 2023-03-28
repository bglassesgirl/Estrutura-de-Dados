package exercicio7;
import exercicio7.Servico;
import java.util.Scanner;


public class Principal {

public static void main(String[] args) {
		
		Scanner scan  = new Scanner (System.in);
		
		System.out.println("Quantas horas você trabalha?  ");
		int numero = scan.nextInt();
		
		
		System.out.println(" " + Servico.salario(numero));
		
		if (Servico.salario(numero) <= 50) {
			 System.out.println("Atenção, dirija-se ao hotel!");
	   
		}
		
		
		
	}
	
	
}
