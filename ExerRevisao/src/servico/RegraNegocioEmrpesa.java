package servico;

import java.util.Arrays;

import basicas.Empresa;

public class RegraNegocioEmrpesa {

	
	Empresa[] emp = new Empresa[3];
	private int tamanho = 0;
	
	
	public void cadastrarEmopresa(Empresa e) {
		aumentaVetorEmpresa();
		this.emp[this.tamanho] = e;
		tamanho++;
	}
	
	
	public String listarEmpresa() {
		return Arrays.toString(this.emp);
	}
	
     
	public Empresa procurarEmpresa(int posicao) {
		return this.emp[posicao];
	}
	
	public void adicionarEmpresaPorPosicao(int posicao, Empresa e) {
		aumentaVetorEmpresa();
		for (int i = this.tamanho-1; i >=  posicao; i--) {
			this.emp[i+1] = this.emp[i];
			
		}
		this.emp[posicao] = e;
		this.tamanho++;
	}
	 
	
	public void removerEmrpesaPorPosicao(int posicao) {
		aumentaVetorEmpresa();
		for (int i = posicao; i < this.tamanho; i++) {
			this.emp[i] = this.emp[i-1];
		}
		this.emp[posicao-1] = null;
		this.tamanho--;
	}
	
	private void aumentaVetorEmpresa () {
		if (this.tamanho == this.emp.length) {
			
			Empresa[] novaEmp = new Empresa[this.emp.length *2];
			System.arraycopy(this.emp,0, novaEmp, 0, this.emp.length);
			this.emp = novaEmp;
		}
	}
	
	
}
