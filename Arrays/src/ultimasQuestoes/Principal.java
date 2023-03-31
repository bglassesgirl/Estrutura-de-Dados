package ultimasQuestoes;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		CadastrarConta cadastro = new CadastrarConta();
		
		cadastro.cadastrarPessoas(null);
		
		Conta c1 = new Conta();
		System.out.println("Digite o nome da nova conta:");
		c1.setNome(in.next());
		System.out.println("Digite o valor da nova conta:");
		c1.setValor(in.nextDouble());
		System.out.println("De 0 a 10, que posição deseja guardar a conta: ");
		int x = in.nextInt();
		cadastro.adicionarPosicao(c1, x);

		System.out.println("Que conta deseja buscar: ?");
		int numero = in.nextInt();
		System.out.println(cadastro.procurarConta(numero));
		System.out.println("Que conta deseja buscar pelo nome?");
		String nome = in.next();
		System.out.println(cadastro.procurarNome(nome));
		cadastro.listarConta();
		
		
	}
}
