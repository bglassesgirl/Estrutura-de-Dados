package principal;

import java.util.ArrayList;

import basicas.Funcionario;
import biblioteca.Array;
import servico.Servico;

public class Principal {

	public static void main(String[] args) {
		
		Servico s = new Servico();
		
		/*Funcionario f = new Funcionario("Luana", "132923923", "dev backend");
		Funcionario f1 = new Funcionario("Beatriz", "45452923923", "dev backend");
		Funcionario f3 = new Funcionario("Murilo", "55452923923", "dev backend");
		Funcionario f4 = new Funcionario("Igor", "65452923923", "Professor");
		s.cadastrar(f);
		s.cadastrar(f1);
		s.cadastrar(f3);
		s.cadastrar(f4);
		
	
	    System.out.println(s.listar());
		
		s.procurar(1); 
		
		s.remover(0);
		
		System.out.println(s.listar());*/
		
		
		
		Array<Funcionario> a = new Array<Funcionario>(); 
		
		Funcionario f5 = new Funcionario("Arhur", "75452923923", "Scrum master");
		Funcionario f6 = new Funcionario("Gabriel", "85452923923", "dev banco de dados");
		Funcionario f7 = new Funcionario("Alisson", "95452923923", "dev redes");
		Funcionario f8 = new Funcionario("Tulio", "95452923923", "dev frontend");
		a.adicionar(f5);
		a.adicionar(f6);
		a.adicionar(f7);
		a.adicionar(f8);
	
		a.listar();
		a.procurarPosicao(3);
		a.remover(3);
	    a.listar(); 
	}
	
	
}
