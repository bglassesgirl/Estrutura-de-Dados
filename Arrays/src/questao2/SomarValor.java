package questao2;

public class SomarValor {

	public int somar (int[] vetor) {
		int somar = 0;
		for (int i =0; i<vetor.length; i++) {
			somar+=vetor[i];
			
		}
		return somar;
	}
}
