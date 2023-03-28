package exercicio3;

public class Servico {

	public static void fibonacci() {
		int x = 0, y = 1;
		
		int i;
		for(i= 0; i <=50; i++) {
			System.out.println(x);
			y = x + y;
			x = y - x;
		}
		
	}
	
}
