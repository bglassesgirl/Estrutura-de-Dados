package principal;

import java.util.Scanner;

import basicas.Empresa;
import basicas.Funcionario;
import cadastros.RegraNegocioEmpresa;
import cadastros.RegraNegocioFuncionario;

public class Principal {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		RegraNegocioFuncionario funcionario = new RegraNegocioFuncionario();
		RegraNegocioEmpresa empresa = new RegraNegocioEmpresa();
		
		
		for(int cont = 0; cont<2; cont++) {
			Empresa e = new Empresa();
			
			System.out.println("Digite o nome da empresa: ");
			e.setNome(in.next());
			
			System.out.println("Digite o CNPJ da empresa: ");
			e.setCnpj(in.next());
			
			System.out.println("Digite o telefone da empresa: ");
			e.setTelefone(in.next());
		}
		
		 System.out.println("Empresas cadastradas:  " +empresa.listar());
	
		 Empresa emp = new Empresa("Apple", "388383", "9293883");
		 System.out.println("Digite a posicao para colocar a empresa: ");
		 empresa.cadastrarPorPosicao(in.nextInt(), emp);
		
		for(int cont = 0; cont <3; cont++) {
			Funcionario f = new Funcionario();
			
			System.out.println("Digite o nome dp funcionário: ");
			f.setNome(in.next());
			
			System.out.println("Digite o cpf do funcionário: ");
			f.setCpf(in.next());
			
			System.out.println("Digite o rg do funcionário: ");
			f.setRg(in.next());
			
			System.out.println("Digite o telefone do funcionário: ");
			f.setTelefone(in.next());
			
			System.out.println("Escolha a empresa! ");
			System.out.println("Empresas disponíveis: " + empresa.listar());
		    f.setEmpresa(empresa.procurarEmpresa(in.nextInt()));
		    
		    funcionario.cadastrarFuncionario(f);
		    
		}
		
		System.out.println("Funcionários cadastrados: "+funcionario.listar());
		in.close();
	}
	
	
}
