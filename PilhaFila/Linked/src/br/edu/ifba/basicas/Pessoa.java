package br.edu.ifba.basicas;

public class Pessoa {

	private int cpf;
	private String nome;
	
	public Pessoa() {
		super();
	}

	public Pessoa(int cpf, String nome) {
		super();
		this.cpf = cpf;
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa [cpf=" + cpf + ", nome=" + nome + "]";
	}
	
}
