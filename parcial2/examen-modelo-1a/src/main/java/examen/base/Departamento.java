package examen.base;

import java.util.function.Predicate;

public class Departamento {

    private String nombre;
    // TODO ejercicio 1: añadir el campo necesario para implementar la relación con Profesor

    public Departamento(String nombre) {
        this.nombre = nombre;
        // TODO ejercicio 1: inicializar el campo
    }

    public String getNombre() {
        return nombre;
    }

    // TODO ejercicio 1: implementar este método
    public void añadirProfesor(Profesor p) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO ejercicio 1: implementar estos métodos de acceso por posición
    public int getNumProfesores() {
        throw new UnsupportedOperationException("TODO");
    }

    public Profesor getProfesor(int pos) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO ejercicio 2: implementar este método usando polimorfismo.
    // Departamento no debe conocer el tipo concreto de cada profesor.
    public int getTotalHoras() {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO ejercicio 4: implementar este método. Debe usar el método forEach
    // del campo de profesores para recorrerlos.
    public int getTotalHoras(Predicate<Profesor> filtro) {
        throw new UnsupportedOperationException("TODO");
    }
}
