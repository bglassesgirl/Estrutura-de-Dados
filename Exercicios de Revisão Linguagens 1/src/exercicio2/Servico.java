package exercicio2;

public class Servico {
 
	public static double continha (char operacao, double v1, double v2) {
		
		 double resultado = 0;
			
		 switch (operacao) {
	     case '+':
	       resultado =  v1+v2;
	       break;
	     case '-':
	    	resultado = v1-v2;
	       break;
	     case '*':
	    	 resultado = v1*v2;
	       break;
	     case '/':
	    	 resultado = v1/v2;
	         break; 
	      default: 
	        
		 }
		 return resultado;
	}
	
}
