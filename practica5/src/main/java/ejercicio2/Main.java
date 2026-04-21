package ejercicio2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Programa programa = new Programa();
        // programa.iniciar();

        ArrayList<Operacion> lista = new ArrayList<>();
        lista.add(new OperacionSaludar());
        lista.add(new OperacionFecha());
        lista.add(new OperacionChiste());
        lista.add(new OperacionSalir());

        Programa programa = new Programa(lista);
        programa.iniciar();
    }
}