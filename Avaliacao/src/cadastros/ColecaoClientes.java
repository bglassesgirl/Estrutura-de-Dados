package cadastros;

import java.util.Arrays;

import basicas.Cliente;

public class ColecaoClientes {

	Cliente[] cliente = new Cliente[10];
	private int tamanho = 0;
	
	
	public void cadastrarCliente(Cliente c ) {
		aumentaVetorCliente();
		this.cliente[this.tamanho] = c;
		tamanho++;
		
	}
	
	public void cadastrarClientePorPosicao(Cliente a, int posicao) {
		aumentaVetorCliente();
		for (int i = this.tamanho-1; i >= posicao; i--) {
			this.cliente[i+1] = this.cliente[i];
		}
		 this.cliente[posicao] = a;
		 posicao++;
	}
	
	public String listarCliente() {
		return Arrays.toString(this.cliente);
	}
	
	
	public Cliente procurarClientePorNome(String nome) {
		for (int i = 0; i <= this.tamanho; i++) {
			if (this.cliente[i].getNome().equalsIgnoreCase(nome)) {
				return this.cliente[i];
			}
		}
		return null;
	}
	
	public void removerClientePorPosicao(int posicao) {
		aumentaVetorCliente();
		for (int i = posicao; i < this.tamanho-1; i++) {
			this.cliente[i] = this.cliente[i+1];
		}
		this.cliente[posicao-1] = null;
		this.tamanho--;
	}

	private void aumentaVetorCliente() {
               if (this.tamanho == this.cliente.length) {
				
            	 Cliente[] novoCliente = new Cliente[this.tamanho*2];  
            	 System.arraycopy(cliente, 0, novoCliente, 0, this.cliente.length);
            	 this.cliente = novoCliente;
			}

		
	}
	
	
}
