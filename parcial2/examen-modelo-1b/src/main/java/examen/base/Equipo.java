package examen.base;

import java.util.function.Predicate;

public class Equipo {

    private String nombre;
    // TODO ejercicio 1: añadir el campo necesario para implementar la relación con Desarrollador

    public Equipo(String nombre) {
        this.nombre = nombre;
        // TODO ejercicio 1: inicializar el campo
    }

    public String getNombre() {
        return nombre;
    }

    // TODO ejercicio 1: implementar este método
    public void añadirDesarrollador(Desarrollador d) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO ejercicio 1: implementar estos métodos de acceso por posición
    public int getNumDesarrolladores() {
        throw new UnsupportedOperationException("TODO");
    }

    public Desarrollador getDesarrollador(int pos) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO ejercicio 2: implementar este método usando polimorfismo.
    // Equipo no debe conocer el tipo concreto de cada desarrollador.
    public int getTotalHoras() {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO ejercicio 4: implementar este método. Debe usar el método forEach
    // del campo de desarrolladores para recorrerlos.
    public int getTotalHoras(Predicate<Desarrollador> filtro) {
        throw new UnsupportedOperationException("TODO");
    }
}
