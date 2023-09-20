package principal;

import java.util.Scanner;

import Servico.ServicoSomar;

public class Principal {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		ServicoSomar s = new ServicoSomar();
		int a = in.nextInt();
		int b = in.nextInt();

		System.out.println("M�todo 1: " + s.somar(a, b));

		System.out.println("Digite agora metodo 2 ");
		System.out.println("M�todo 2: " + s.somar(in.nextInt(), in.nextInt(), in.nextInt()));

		in.close();
	}

}
