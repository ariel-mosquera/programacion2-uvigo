package ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        DireccionCorreo correo1 = new DireccionCorreo("esei.uvigo.es", "Ariel", "Mosquera Ribeiro", "amribeiro25");
        DireccionCorreo correo2 = new DireccionCorreo("Ariel", "Mosquera Ribeiro");

        System.out.println("Tipo 1: " + correo1);

        System.out.println("Tipo 2: " + correo2);
    }
}
