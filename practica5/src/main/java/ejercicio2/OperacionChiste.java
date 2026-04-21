package ejercicio2;

public class OperacionChiste implements Operacion {

    public String getDescripcion() {
        return "Chiste";
    }

    public void ejecutar() {
        System.out.println("""
                ¿Qué le dice un bit a otro bit?...
                ¡Nos vemos en el bus!""");
    }
}
