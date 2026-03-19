package ejercicio2;

public enum TipoCuenta {

    CORRIENTE(0.5),
    AHORRO(0.0),
    PREMIUM(2.0);

    private double comisionMensual;

    TipoCuenta (double comisionMensual) {
        this.comisionMensual = comisionMensual;
    }

    public double getComisionMensual() {
        return comisionMensual;
    }
}
