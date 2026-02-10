package ejercicio1;

public class Libro {
    private final String titulo;
    private final String autores;
    private final String editorial;
    private final int anho;
    private final String isbn;
    private final TipoLibro tipo;

    Libro(String titulo, String autores, String editorial, int anho, String isbn, TipoLibro tipo) {
        this.titulo = titulo;
        this.autores = autores;
        this.editorial = editorial;
        this.anho = anho;
        this.isbn = isbn;
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutores() {
        return autores;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getAnho() {
        return anho;
    }

    public String getIsbn() {
        return isbn;
    }

    public TipoLibro getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return """
                Titulo = %s
                Autores = %s
                Editorial = %s
                Año = %d
                Isbn = %s
                tipo = %s """.formatted(titulo, autores, editorial, anho, isbn, tipo);
    }
}
