package br.edu.ifba.principal;

import java.util.Arrays;
import java.util.Random;

import br.edu.ifba.servicos.ServicoZerinho;

public class ZerinhoUm {
	
	
   public static void main(String[] args) {
	
	   Random ram = new Random();
	   
	   int[] zerinho = new int[3];
	   
	   ServicoZerinho sz = new ServicoZerinho();
	   
	   for (int i = 0; i < zerinho.length; i++) {
		     zerinho[i] = ram.nextInt(2);
	}
	   
	   System.out.println(Arrays.toString(zerinho));
	   System.out.println(sz.verificarZerinho(zerinho));
}
}
