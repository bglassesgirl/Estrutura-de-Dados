import biblioteca.array.*;
public class Principal {

public static void main(String[] args) {
	Array<Integer> lista = new Array<Integer>();
	
	lista.adicionar(1);
	lista.adicionar(2);
	lista.adicionar(5);
	lista.adicionarPorPosicao(1, 100);
	
	lista.listar();
	
	lista.remover(1);
	
	lista.listar();
 }	
}
