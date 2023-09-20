package teste;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>();
		lista.add("Luana");
		lista.add("Julia");
		lista.add("Bia");
		lista.add("Maria Luiza");
		lista.add("Jennie");
		
        System.out.println(lista.toString());
        
        
        
        for(int cont=0; cont< lista.size(); cont++) {
             System.out.println(lista.get(cont));
        }
        
        /*
         * função  lambida
         * funções que se concatenam em si
         * comum em python
         */
        System.out.println("=====================");
    	lista.forEach(System.out::println);
    	
    	System.out.println("=====================");
    	lista.stream().filter(i -> i.equals("Jennie")).forEach(System.out::println);
	}

}
