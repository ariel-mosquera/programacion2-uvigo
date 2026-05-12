package examen.base;

import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String nombre;
    private List<Desarrollador> desarrolladores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.desarrolladores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void anadirDesarrollador(Desarrollador d) {
        if (d == null)
            throw new IllegalArgumentException("El desarrollador no puede ser null");

        desarrolladores.addLast(d);
    }

    public int getNumDesarrolladores() {
        return this.desarrolladores.size();
    }

    public Desarrollador getDesarrollador(int pos) {
        if (pos < 0 || pos >= this.getNumDesarrolladores())
            throw new IllegalArgumentException("Posición inválida");

        return this.desarrolladores.get(pos);
    }

    public int getTotalHoras() {
        int suma = 0;

        for (Desarrollador desarrollador : desarrolladores) {
            suma += desarrollador.getHorasMaximas();
        }
        
        return suma;
    }

    // TODO ejercicio 4: implementar este método. Debe usar el método forEach
    // del campo de desarrolladores para recorrerlos.
    public int getTotalHoras(Predicate<Desarrollador> filtro) {
        throw new UnsupportedOperationException("TODO");
    }
}
