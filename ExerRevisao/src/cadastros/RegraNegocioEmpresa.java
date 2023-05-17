package cadastros;

import java.util.Arrays;

import basicas.Empresa;

public class RegraNegocioEmpresa {
  
	Empresa[] emp = new Empresa[3];
    private int total = 0;
	
	
	public void cadastrarEmpresa(Empresa e) {
		this.emp[this.total] = e;
		this.total++;
	}
	
	public String listar() {
		return Arrays.toString(this.emp);
	}
	
	public void cadastrarPorPosicao(int posicao, Empresa e){
		for(int cont = this.total-1; cont >= posicao; cont--) {
			this.emp[cont+1] = this.emp[cont];
		}
		this.emp[posicao] = e;
		this.total++;
		
	}
	
	public void removerPosicao(int posicao ) {
		for(int cont = posicao; cont<this.total; cont++ ) {
			this.emp[cont] = this.emp[cont+1];
		}
		
		this.emp[this.total-1] = null;
		this.total--;
	}
	
	public Empresa procurarEmpresa(int posicao) {
		return this.emp[posicao];
	}
	
	private void aumentaVetor() {
		if(this.total==this.emp.length) {
			
			Empresa[] newEmp = new Empresa[this.emp.length*2];
			System.arraycopy(this.emp, 0, newEmp, 0, this.emp.length);
			
			this.emp = newEmp;
		}
	}

}
