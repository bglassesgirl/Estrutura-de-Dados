package servico;

import java.util.ArrayList;
import java.util.List;

public class ServicoInterccao {

	public  int[] mostrarIntersecao(int[] a, int[] b) {

		List<Integer> listaIntersecao = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {
			for (int cont = 0; cont < b.length; cont++) {
				if (a[i] == b[cont]) {
					listaIntersecao.add(a[i]);
					break;

				}
			}
			
		}
			int[] intersecao = new int[listaIntersecao.size()];

			for (int j = 0; j < listaIntersecao.size(); j++) {
				intersecao[j] = listaIntersecao.get(j);

			}
			
 
	    return intersecao;
	}
	
	
}
	
	

