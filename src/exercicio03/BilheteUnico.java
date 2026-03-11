package exercicio03;

import java.util.Random;

public class BilheteUnico {
    int numero;
    double saldo;
    String usuario;
    String tipoTarifa;
    final static double tarifaBase = 5.40;

    public BilheteUnico(String usuario, String tipoTarifa) {
        Random random = new Random();
        this.numero = random.nextInt(1000, 9999);
        this.saldo = 0;
        this.usuario = usuario;
        this.tipoTarifa = tipoTarifa;
    }

    public void carregar(double valor) {
        this.saldo += valor;
    }

    public boolean passarNaCatraca() {
        double valor = tarifaBase;
        if(tipoTarifa.equalsIgnoreCase("estudante") ||
                tipoTarifa.equalsIgnoreCase("professor")) {
            valor = valor / 2;
        }

        if(saldo < valor) {
            return false;
        }

        saldo -= valor;
        return true;
    }

}
