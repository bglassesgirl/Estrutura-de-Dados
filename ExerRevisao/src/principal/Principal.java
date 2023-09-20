package principal;

import java.util.Scanner;

import basicas.Empresa;
import servico.RegraNegocioEmrpesa;
import servico.RegraNegocioFuncionario;

public class Principal {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
	     
		RegraNegocioEmrpesa empresa = new RegraNegocioEmrpesa();
		RegraNegocioFuncionario funcionario = new RegraNegocioFuncionario();
		
		
		for (int i = 0; i < 3; i++) {
			Empresa empr = new Empresa();
			
			System.out.println("Digite o nome da empresa: ");
			empr.setNome(in.next());
			
			
			System.out.println("Digite o cnpj da empresa: ");
			empr.setCnpj(in.next());
			
			System.out.println("Digite o telefone da empresa: ");
			empr.setTelefone(in.next());
			
			empresa.cadastrarEmopresa(empr);
			
		}
		
		 System.out.println("Empresas cadastradas:" + empresa.listarEmpresa());
		
		 Empresa emp = new Empresa("IFBA", "929293", "38383");
		 System.out.println("Qual posicao deseja colocar essa empresa: ");
		 empresa.adicionarEmpresaPorPosicao(in.nextInt(), emp);;
		
		 
		 
		 System.out.println(empresa.listarEmpresa());
	}
	
}
