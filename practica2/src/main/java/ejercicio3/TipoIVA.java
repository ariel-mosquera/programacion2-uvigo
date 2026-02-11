package ejercicio3;

public enum TipoIVA {
    EXENTO(0),
    SUPERREDUCIDO(0.04),
    REDUCIDO(0.1),
    GENERAL(0.25);

    // Atributo privado encapsulado (Estado del objeto). --> El porcentage no debe
    // cambiar, private para protegerlo y final para que sea inmutable
    private final double porcentage;

    // Constructor del enumerado, por defecto en java los constructores del enum son
    // privados
    // Se ejecuta una vez para cada constante del enum (EXENTO, SUPERREDUCIDO...)
    private TipoIVA(double porcentage) {
        this.porcentage = porcentage;
    }

    // getter para acceder a la porcentage de cada enum: Mes.MES.getPorcentage()
    public double getPorcentage() {
        return porcentage;
    }

    double calcularPrecioFinal(double precio) {
        return precio * (1 + this.porcentage);
    }

}
