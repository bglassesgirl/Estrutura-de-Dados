package exercicio5;

public class Servico {

	
	public static void par (int numero) {
		 
		 if (numero % 2 == 0) {
			 System.out.println("O n�mero � Par");
			 
		 } else {
			 System.out.println("O n�mero � Impar");
		 }
		
	}
	
	public static String primo (int n) {
		String a = null;
		
		for (int p = 2; p < n; p++) {
			  if (n % p == 0) {
				  System.out.println("N�o � primo");
			  }else if(n % p == 2) {
					 System.out.println("N�mero � primo");
			  } else {
				  System.out.println("O n�mero � primo");
			  }
		}
		 return a;
	}
	
	
}
