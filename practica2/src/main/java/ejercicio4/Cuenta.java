package ejercicio4;

public class Cuenta {
    private double saldo;
    private static double saldoTotal = 0;

    public Cuenta(double saldoInicial) {
        setSaldo(saldoInicial);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public static double getSaldoTotal() {
        return saldoTotal;
    }

    static void resetSaldoTotalParaTests() {
        saldoTotal = 0;
    }

    public void setSaldo(double nuevoSaldo) {
        if (nuevoSaldo < 0) {
            System.out.println("Valor inválido, finalizando programa...");
            System.exit(1);
        } else {
            saldoTotal += (nuevoSaldo - this.saldo);
            this.saldo = nuevoSaldo;
        }
    }

    public void ingresarDinero(double valor) {
        if (valor < 0)
            System.out.println("Valor inválido");
        else
            setSaldo(getSaldo() + valor);
    }

    public void retirarDinero(double valor) {
        if (valor < 0)
            System.out.println("Valor inválido");
        else
            setSaldo(getSaldo() - valor);
    }

    @Override
    public String toString() {
        return "Saldo de la cuenta: " + getSaldo() + "€";
    }
}
