package servico;

public class ServicoCalcular {


	public int calcularSoma(int[] vetor) {
		int soma = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			 soma += vetor[i];
			
		}
		return soma;
	}
	
	
}
