package principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import servico.ServicoInterccao;

public class Interseccao {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Digite o tamanho do vetor: ");
		int tamanho = in.nextInt();

		int[] a = new int[tamanho];
		int[] b = new int[tamanho];

		// armazenar dados atraves do for no vetor
		for (int i = 0; i < tamanho; i++) {
			System.out.println("Digite um número para o vetor 1: ");
			a[i] = in.nextInt();
		}
		
        System.out.println();
        
		for (int i = 0; i < tamanho; i++) {
			System.out.println("Digite um número para o vetor 2: ");
			b[i] = in.nextInt();
		}
         
		ServicoInterccao s = new ServicoInterccao();
	     int[] inters = s.mostrarIntersecao(a, b);
        System.out.println("INTERSECAO: " + Arrays.toString(inters));
        
	}

	
	
}
