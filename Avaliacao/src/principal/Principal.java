package principal;

import java.util.Scanner;

import basicas.Cliente;
import basicas.Filial;
import cadastros.ColecaoClientes;
import cadastros.ColecaoFilial;

public class Principal {

	
	public static void main(String[] args) {
		
		
		/*Scanner in = new Scanner(System.in);
		
		ColecaoClientes clientes = new ColecaoClientes();
		ColecaoFilial filiais = new ColecaoFilial();
		
	
		for(int cont = 0; cont < 2; cont++) {
			Filial f = new Filial();

			System.out.println("Digite o nome da filial: ");
			f.setNome(in.next());
		    

			System.out.println("Digite a cidade da filial ");
			f.setCidade(in.next());
			
			filiais.cadastrarFilial(f);
		}  
		
		System.out.println(filiais.listarFilial());
	    
		for(int cont = 0; cont < 2; cont++) {
			Cliente c = new Cliente();

			System.out.println("Digite o nome do Cliente: ");
			c.setNome(in.next());
		    

			System.out.println("Digite o telefone: ");
			c.setTelefone(in.next());
			
			System.out.println("Digite o rg: ");
			c.setRg(in.next());
			
			
			System.out.println("Qual filial o cliente pertence? ");
			
			System.out.println("Filiais disponíveis: " + filiais.listarFilial());
		    c.setFilial(filiais.procurarFilialPorNome(in.next()));
		    
		    
		    clientes.cadastrarCliente(c);
		}  
		
		
		System.out.println("Clientes cadastrados: "+clientes.listarCliente());
		
		System.out.println(clientes.procurarClientePorNome("fulano"));
	
		
		Filial cc = new Filial();
		cc.setCidade("CHINA");
		cc.setNome("MOTOROLA");
		filiais.cadastrarFilialPorPosicao(cc, 2);
		System.out.println(filiais.listarFilial());
		
		
		filiais.removerFilialPorPosicao(1);
		System.out.println(filiais.listarFilial());
		in.close();*/
		
		ColecaoFilial cf = new ColecaoFilial();
		
		Filial f1 = new Filial("Avon", "AB");
		Filial f2 = new Filial("Oboticario", "AB");
		Filial f3 = new Filial("MariMaria", "AB");
		
		
		cf.cadastrarFilial(f1);
		cf.cadastrarFilial(f2);
		cf.cadastrarFilial(f3);
		
		System.out.println("Lista de Filiais: "+ cf.listarFilial());
		
		cf.removerFilialPorPosicao(0);
		
		System.out.println("Lista de Filiais: "+ cf.listarFilial());

 }
}
