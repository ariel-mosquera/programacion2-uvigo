package ejercicio1;

public class Punto {

    // atributos (unicos para cada objeto)
    double x;
    double y;

    // constructor
    Punto(double x, double y) {
        this.x = x; // this -> para referenciar al atributo de la clase con mismo del argumento
        this.y = y;
    }

    double distanciaOrigen() {
        return Math.sqrt(x * x + y * y); // Math -> libreria de java que contiene operaciones matematicas
    }

    // toString
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
