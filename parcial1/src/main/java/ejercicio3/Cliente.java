package ejercicio3;

import ejercicio2.TipoCuenta;

public class Cliente {

    private String dni;
    private String nombre;
    private double saldo;
    private TipoCuenta tipoCuenta;
    private static int totalClientes = 0;

    // dni y nombre no pueden ser null ni vacíos; lanza IllegalArgumentException si lo son
    // saldo debe ser >= 0.0; lanza IllegalArgumentException si no lo es
    // tipoCuenta no puede ser null; lanza IllegalArgumentException si lo es
    public Cliente(String dni, String nombre, double saldo, TipoCuenta tipoCuenta) throws IllegalArgumentException {
        if (dni == null || dni.equals("") || saldo < 0.0 || tipoCuenta == null)
            throw new IllegalArgumentException("Error, argumento inválido");
        
        setNombre(nombre);
        this.dni = dni;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
        totalClientes++;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    // nombre no puede ser null ni vacío; lanza IllegalArgumentException si lo es
    public void setNombre(String nombre) throws IllegalArgumentException {
        if (nombre == null || nombre.equals("") )
            throw new IllegalArgumentException("Error, el nombre no puede ser null o vacío");
        else
            this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public static int getTotalClientes() {
        return totalClientes;
    }

    // Calcula el saldo después de aplicar la comisión mensual del tipo de cuenta
    public double saldoNetoMensual() {
        return saldo - tipoCuenta.getComisionMensual();
    }

    // Ejemplo: "Cliente[12345678A] Ana García (AHORRO) - 150.0 €"
    @Override
    public String toString() {
        return "Cliente[%s] %s (%s) - %f €".formatted(dni, nombre, tipoCuenta, saldo);
    }
}
