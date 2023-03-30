package ultimasQuestoes;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Conta c = new Conta();
		
		System.out.println();
		
		CadastrarConta con = new CadastrarConta();
		con.adicionar(c);
		con.listar();
		System.out.println(con.procurarPosicao(1));
		
	}
}
