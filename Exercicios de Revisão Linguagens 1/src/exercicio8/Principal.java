package exercicio8;

import java.util.Scanner;

import exercicio8.Servico;

	public class Principal {
		
		public static void main(String[] args) {
			
			Scanner in = new Scanner (System.in);
			
			System.out.println("Digite o quanto foi gasto da produção e o preço de venda ");
			int numero  = in.nextInt();
			int numero2 = in.nextInt();
			
			Servico.porcentagem(numero, numero2);
			
			
		

		}
	
	
}
