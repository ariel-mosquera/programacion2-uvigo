package ejercicio3;

public enum TipoIVA {
    EXENTO(0),
    SUPERREDUCIDO(0.04),
    REDUCIDO(0.1),
    GENERAL(0.25); // punto y coma solo es necesario cuando hay lógica encapsulada

    // Atributo privado encapsulado (Estado del objeto). --> El porcentaje no debe
    // cambiar, private para protegerlo y final para que sea inmutable
    private final double porcentaje;

    // Constructor del enumerado, por defecto en java los constructores del enum son
    // privados
    // Se ejecuta una vez para cada constante del enum (EXENTO, SUPERREDUCIDO...)
    private TipoIVA(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    // getter para acceder a la porcentaje de cada enum: Mes.MES.getPorcentage()
    public double getPorcentaje() {
        return porcentaje;
    }

    public double calcularPrecioFinal(double precioBase) {
        return precioBase * (1 + this.porcentaje);
    }

}
