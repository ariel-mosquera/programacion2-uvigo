package ejercicio5;

public enum Operacion {
    SUMA,
    RESTA,
    MULTIPLICACION,
    DIVISION;

    public double calcular(double a, double b) {
        return switch (this) {
            case SUMA -> a + b;
            case RESTA -> a - b;
            case MULTIPLICACION -> a * b;
            case DIVISION -> (b == 0) ? Double.NaN : (a / b);
        };
    }
}
