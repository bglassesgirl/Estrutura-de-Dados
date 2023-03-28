package exercicio4;

public class Servico {

  public  int impar() {
	 int soma = 0; 
	 for(int s = 1; s <= 30; s++) {
		 if(s%2 != 0){
			  soma = soma +s;
		 }
	 }
	   return soma;
		
	}
   public static void pares () {
	
	   int par = 1;
	   
	   int p;
		 for(p = 0; p <= 30; p++) {
			 if(p%2 == 0){
				int multiplicacao = (par = par *p);
				System.out.println("Multlicando os números pares no intervalo de 0 a 30: " +multiplicacao);
			 }
		 }
  }	
}

