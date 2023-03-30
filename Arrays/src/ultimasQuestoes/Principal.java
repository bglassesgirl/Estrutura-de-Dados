package ultimasQuestoes;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		CadastrarConta cadastro = new CadastrarConta();
		for (int i = 0; i < 2; i++) {
			Conta c = new Conta();
			System.out.println("Digite o nome da nova conta:");
			c.setNome(in.next());
			System.out.println("Digite o valor da conta:");
			c.setValor(in.nextDouble());
			cadastro.adicionarConta(c);
		}
		
		Conta c1 = new Conta();
		System.out.println("Digite o nome da conta:");
		c1.setNome(in.next());
		System.out.println("Digite o valor da conta:");
		c1.setValor(in.nextDouble());
		System.out.println("De 0 a 10, que posição deseja guardar a conta: ");
		int x = in.nextInt();
		cadastro.adicionarPosicao(c1, x);

		//System.out.println("Que conta deseja buscar: ?");
		//int numero = in.nextInt();
		//System.out.println(cadastro.procurarConta(numero - 1));
		System.out.println("Que conta deseja pelo nome?");
		String nome = in.next();
		System.out.println(cadastro.procurarNome(nome));
		cadastro.listarConta();
	}
}
