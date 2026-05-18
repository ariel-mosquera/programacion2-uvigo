package ejercicio2;

import ejercicio1.Autor;

public class Articulo extends Publicacion {
    private final String nombreRevista;
    private final int volumen;
    private final int paginaInicial;
    private final int paginaFinal;

    public Articulo(Autor autor, String titulo, int anho, int numCitas, String nombreRevista, int volumen, int paginaInicial, int paginaFinal) {
        if (paginaInicial < 0 || paginaFinal < paginaInicial)
            throw new InvalidPageException("Página inválida");

        super(autor, titulo, anho, numCitas);
        this.nombreRevista = nombreRevista;
        this.volumen = volumen;
        this.paginaInicial = paginaInicial;
        this.paginaFinal = paginaFinal;
    }

    public String getNombreRevista() {
        return nombreRevista;
    }

    public int getVolumen() {
        return volumen;
    }

    public int getPaginaInicial() {
        return paginaInicial;
    }

    public int getPaginaFinal() {
        return paginaFinal;
    }

    @Override
    public String toString() {
        return super.toString() + """
                Revista: %s
                Volumen: %d
                Páginas: %d - %d
                """.formatted(this.getNombreRevista(), this.getVolumen(), this.getPaginaInicial(), this.getPaginaFinal());
    }

}
