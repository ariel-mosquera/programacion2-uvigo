package ejercicio2;

import ejercicio1.Autor;

public class Libro extends Publicacion {
    private final String editorial;
    private final String lugar;

    public Libro(Autor autor, String titulo, int anho, int numCitas, String editorial, String lugar) {
        super(autor, titulo, anho, numCitas);
        this.editorial = editorial;
        this.lugar = lugar;
    }

    public String getEditorial() {
        return this.editorial;
    }

    public String getLugar() {
        return this.lugar;
    }

    @Override
    public String toString() {
        return """
                Primer autor: %s
                Titulo: %s
                Anho: %d
                Citas: %d
                Editorial: %s
                Lugar: %s
                 """.formatted(super.getPrimerAutor().getNombre(), super.getTitulo(), super.getAnho(), super.getNumCitas(), this.getEditorial(), this.getLugar());
    }
}
