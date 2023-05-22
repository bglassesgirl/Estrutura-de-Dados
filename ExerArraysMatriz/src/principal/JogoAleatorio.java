package principal;
import java.util.Scanner;

import servicos.ServicoJogoAleatorio;

public class JogoAleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		ServicoJogoAleatorio j = new ServicoJogoAleatorio ();
        String a = "";
        
        System.out.println(" -- Jogo número aleatório -- ");
        System.out.println("            ------            ");
        System.out.println(" - regras do jogo: \n"
        		           + "() um número aleatorio é gerado entre 0 e 99;\n"
        		           + "() você deve advinhar qual é esse número;\n"
        		           + "() o programa te fornecerá dicas até você acertar ;)\n"
        		           + "() seja bem vindo(a), boa sorte!\n"
        		           + "---------------------------------------\n");
        
        
		while (!a.equals("Parabéns, você acertou!")) {
			System.out.print("Digite seu chute: ");
			a = j.intervaloAleatorio(in.nextInt());
			System.out.println(a);
			System.out.println("---------------------------------------");
		}
		
		 
		 System.out.println("-- você tentou : "+j.mostrarTotal()+" "+"vezes!");
		 System.out.println(j.toString());
		 in.close();
	}

}
