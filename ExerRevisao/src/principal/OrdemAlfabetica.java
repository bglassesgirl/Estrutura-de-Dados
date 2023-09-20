package principal;

import java.util.Arrays;
import java.util.Scanner;

public class OrdemAlfabetica {

	
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		int tamanho = 3;
		String[] vetor = new String[tamanho];
		
	    //armazenar dados atraves do for no vetor
		for (int i = 0; i < tamanho; i++) {
			System.out.println("Digite um nome: ");
			vetor[i] = in.next();
		}	
		
		//ordenando em ordem alfabetica 
		Arrays.sort(vetor);
		
     	  //System.out.println(Arrays.toString(vetor));	
		
		
		//usar for each fica mais elegante 
		for (String string : vetor) {
				System.out.println(string);
			}
		in.close();
	  
	}

	
}
