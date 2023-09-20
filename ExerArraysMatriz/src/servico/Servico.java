package servico;

import java.util.ArrayList;
import java.util.Arrays;

import basicas.Funcionario;

public class Servico {

	private ArrayList<Funcionario> f = new ArrayList<Funcionario>();

	public void cadastrar(Funcionario funcionario) {
		f.add(funcionario);
	}

	public void remover(String cpf) {
		for (Funcionario fun : f) {
			if (fun.getCpf().equals(cpf)) {
				f.remove(fun);
				break;
			}
		}

	}

	public void procurar(String nome) {
		for (Funcionario fun : f) {
			if (fun.getNome().equals(nome)) {
				System.out.println(fun);
				break;
			}
		}
	}

	public void listar() {
		if (f.isEmpty()) {
			System.out.println("Atenção. Não existem funcionários cadastrados!!");
		} else {
			System.out.println("Lista de funcionários: ");
			for (Funcionario fun : f) {
				System.out.println(fun);
			}
		}
	}
}

