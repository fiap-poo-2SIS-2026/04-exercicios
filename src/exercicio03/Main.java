package exercicio03;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static BilheteUnico bilhete;

    static {
        System.out.print("Nome do usuário --> ");
        String usuario = sc.nextLine();
        System.out.print("Tipo de tarifa (professor ou estudante ou normal) --> ");
        String tipoTarifa = sc.next();
        bilhete = new BilheteUnico(usuario, tipoTarifa);
    }

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("*****************************************");
            System.out.println("1. Carregar bilhete");
            System.out.println("2. Consultar saldo");
            System.out.println("3. Passar na catraca");
            System.out.println("4. Finalizar");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1 -> carregar();
                case 2 -> consultar();
                case 3 -> catraca();
                case 4 -> System.out.println("Obrigado por usar o nosso App");
                default -> System.out.println("Opção inválida");
            }

        } while(opcao != 4);
    }

    private static void catraca() {
        if(!bilhete.passarNaCatraca()) {
            System.out.println("Saldo insuficiente");
        }
        consultar();
    }

    private static void consultar() {
        System.out.println("Saldo atual R$ " + bilhete.saldo);
    }

    private static void carregar() {
        double valor;
        System.out.print("Valor da recarga --> R$ ");
        valor = sc.nextDouble();
        bilhete.carregar(valor);
    }
}
