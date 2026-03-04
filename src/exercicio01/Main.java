package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double valor;
        int quantidade;

        System.out.print("Nome do produto --> ");
        nome = sc.next();
        System.out.print("Valor do produto --> R$ ");
        valor = sc.nextDouble();
        System.out.print("Quantidade inicial em estoque ");
        quantidade = sc.nextInt();

        Produto produto = new Produto(nome, valor, quantidade);

        System.out.println(produto.valor);
        System.out.println(produto);

    }
}
