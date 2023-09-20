package principal;

import java.util.Arrays;
import java.util.Scanner;

import basicas.Aluno;
import colecao.ColecaoAlunos;

public class PrincipalAluno {
	public static void main(String[] args) {
		  
		 Scanner in = new Scanner(System.in);
		  
		 //Aluno b = new Aluno ("Luana", "201910070008", "092882828");
		// Aluno c = new Aluno ("Julia", "201910070009", "092000828");
		 
		 ColecaoAlunos alunos = new ColecaoAlunos();
		 
		 for (int cont=0; cont<2; cont++) {
			 Aluno a = new Aluno(); 
			 System.out.println("Digite o nome do aluno, o cpf e matricula: ");
			 a.setNome(in.nextLine());
			 a.setCpf(in.nextLine());
			 a.setMatricula(in.nextLine());
			 
			 alunos.colecao(a);
		 }
		 
		 System.out.println(Arrays.toString(alunos.returnAluno()));
		 
	  }
}
