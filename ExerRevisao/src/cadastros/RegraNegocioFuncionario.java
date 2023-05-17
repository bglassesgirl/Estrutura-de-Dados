package cadastros;

import java.util.Arrays;

import basicas.Funcionario;

public class RegraNegocioFuncionario {

	Funcionario[] fun = new Funcionario[3];
	private int total = 0;
	
	
	public void cadastrarFuncionario(Funcionario f) {
		this.fun[this.total] = f;
		this.total++;
	}
	
	public String listar() {
		return Arrays.toString(this.fun);
	}
}

