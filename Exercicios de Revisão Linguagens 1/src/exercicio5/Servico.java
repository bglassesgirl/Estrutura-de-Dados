package exercicio5;

public class Servico {

	
	public static void par (int numero) {
		 
		 if (numero % 2 == 0) {
			 System.out.println("O número é Par");
			 
		 } else {
			 System.out.println("O número é Impar");
		 }
		
	}
	
	public static String primo (int n) {
		String a = null;
		
		for (int p = 2; p < n; p++) {
			  if (n % p == 0) {
				  System.out.println("Não é primo");
			  }else if(n % p == 2) {
					 System.out.println("Número é primo");
			  } else {
				  System.out.println("O número é primo");
			  }
		}
		 return a;
	}
	
	
}
