package colecao;

import basicas.Aluno;

public class ColecaoAlunos {

	private Aluno[] alunos = new Aluno[5];

	public void colecao(Aluno aluno) {
		for (int cont = 0; cont < this.alunos.length; cont++) {
			if (this.alunos[cont] == null) {
				this.alunos[cont] = aluno;
				break;

			}
		}
	}

	public Aluno[] returnAluno() {
		return this.alunos;
	}

	
}
