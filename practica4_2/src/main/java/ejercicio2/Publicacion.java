package ejercicio2;

import ejercicio1.Autor;

public class Publicacion {
    private final Autor primerAutor;
    private final String titulo;
    private final int anho;
    private final int numCitas;

    public Publicacion(Autor primerAutor, String titulo, int anho, int numCitas) {
        this.primerAutor = primerAutor;
        this.titulo = titulo;
        this.anho = anho;
        this.numCitas = numCitas;
    }

    public Autor getPrimerAutor() {
        return new Autor(this.primerAutor.getOrcid(), this.primerAutor.getNombre(), this.primerAutor.getApellidos(),
                this.primerAutor.getInstitucion());
    }

    public String getTitulo() {
        return this.titulo;
    }

    public int getAnho() {
        return this.anho;
    }

    public int getNumCitas() {
        return this.numCitas;
    }

    @Override
    public String toString() {
        return """
                Autor: %s
                Titulo: %s
                Anho: %d
                Citas: %d
                """.formatted(this.getPrimerAutor().getNombre(), this.getTitulo(), this.getAnho(), this.getNumCitas());
    }
}
