package questão1;

public class NomeAluno implements Comparable<NomeAluno> {

	
	private String nome;

	public NomeAluno() {}

	public NomeAluno(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "NomeAluno [nome=" + nome + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int compareTo(NomeAluno a) {
		return this.getNome().compareToIgnoreCase(a.getNome());
		                  //ignore case vai ignorar letras maiosculas e minusculas 
	}
}
