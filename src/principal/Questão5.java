package principal;

import java.util.Arrays;
import java.util.Scanner;

import basicas.Produto;

public class Questão5 {

    public static void main(String[] args) {
    	
        Produto[] listaProdutos = new Produto[6]; // Tamanho do vetor ajustado para comportar produtos adicionais
        int quantidadeProdutosCadastrados = 3; // Quantidade de produtos cadastrados inicialmente
        Scanner scanner = new Scanner(System.in);

        Produto p1 = new Produto();
        p1.setNome("Danone");
        p1.setValor(11.50);

        Produto p2 = new Produto();
        p2.setNome("Salgadinho");
        p2.setValor(12);

        Produto p3 = new Produto();
        p3.setNome("Sorvete");
        p3.setValor(14.50);

        listaProdutos[0] = p1;
        listaProdutos[1] = p2;
        listaProdutos[2] = p3;

        // LISTANDO COM toString
        System.out.println("Lista de produtos cadastrados: ");
        System.out.println(Arrays.toString(listaProdutos));

        // setando COM FOR
        System.out.println("\nCadastro de produtos (gerente): ");
        for (int i = quantidadeProdutosCadastrados; i < listaProdutos.length; i++) {
            System.out.print("-> Nome: ");
            String nome = scanner.next();
            System.out.print("-> Valor: ");
            double valor = scanner.nextDouble();

            Produto produto = new Produto();
            produto.setNome(nome);
            produto.setValor(valor);

            listaProdutos[i] = produto;
            quantidadeProdutosCadastrados++;
        }

        System.out.println("Lista de produtos depois do cadastro do gerente: ");
        //listando com for 
        for (int i = 0; i < quantidadeProdutosCadastrados; i++) {
            if (listaProdutos[i] != null) {
                System.out.println(listaProdutos[i]);
            }
        }

        System.out.print("Desconto do gerente (%): ");
        double descontoGerente = scanner.nextDouble();

        //gerando o desconto fornecido pelo gerente da compra total do produto 
        double totalSemDesconto = 0;
        double totalComDesconto = 0;
        for (int i = 0; i < quantidadeProdutosCadastrados; i++) {
            if (listaProdutos[i] != null) {
                double valorProduto = listaProdutos[i].getValor();
                totalSemDesconto += valorProduto;
                double valorDesconto = valorProduto - (valorProduto * (descontoGerente / 100));
                totalComDesconto += valorDesconto;
            }
        }

        System.out.println("Valor total sem desconto: " + totalSemDesconto);
        System.out.println("Valor total com desconto: " + totalComDesconto);
    }

}
