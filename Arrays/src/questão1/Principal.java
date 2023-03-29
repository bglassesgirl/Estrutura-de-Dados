package questão1;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);

		OrdemAlfabetica ordem = new OrdemAlfabetica();
		//String[] nome = new String[10];
		//para fazer uma classe só e usar tudo na main 
		
		for (int cont = 0; cont < 10; cont++) {
			NomeAluno a = new NomeAluno();
			System.out.println("Digite o nome de DEZ alunos: ");
			a.setNome(in.nextLine());

			ordem.cadastroOtimizado(a);
			
		}
          //Array.sort(ordem);
		 System.out.println(Arrays.toString(ordem.retornoNome()));
		
	}
	
}
