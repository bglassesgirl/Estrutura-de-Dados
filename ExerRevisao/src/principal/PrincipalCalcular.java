package principal;

import java.util.Scanner;

import servico.ServicoCalcular;

public class PrincipalCalcular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner in = new Scanner(System.in);
		
		int tamanho = 10;
		int[] vetor = new int[tamanho];
		int cont = 0;
		
	    //armazenar dados atraves do for no vetor
		for (int i = 0; i < tamanho; i++) {
			System.out.println("Digite um número: ");
			vetor[i] = in.nextInt();
		}	
		
		ServicoCalcular cs = new ServicoCalcular();
		System.out.println(cs.calcularSoma(vetor));
		
	}

}
