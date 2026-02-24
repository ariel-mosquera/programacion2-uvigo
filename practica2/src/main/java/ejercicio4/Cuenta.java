package ejercicio4;

public class Cuenta {
    private double saldo;
    private static double saldoTotal = 0;

    public Cuenta(double saldoInicial) {
        setSaldo(saldoInicial);
        saldoTotal += saldoInicial;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede ser negativo");
            System.exit(1);
        }
    }

    public void ingresarDinero(double valor) {
        if (valor < 0) {
            System.out.println("Valor inválido, finalizando programa...");
            System.exit(1);
        } else {
            setSaldo(getSaldo() + valor);
            saldoTotal += valor;
        }
    }

    public void retirarDinero(double valor) {
        if (valor < 0) {
            System.out.println("Valor inválido, finalizando programa...");
            System.exit(1);
        } else {
            setSaldo(getSaldo() - valor); // deberia imponer condiciones aqui? o la invariante de clase ya es
                                          // suficiente?
            saldoTotal -= valor;
        }
    }
}
