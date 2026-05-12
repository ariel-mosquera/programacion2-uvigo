package ejercicio1;

public class Articulo extends Publicacion {
    private final String nombreRevista;
    private final int volumen;
    private final int paginaInicial;
    private final int paginaFinal;

    public Articulo(String nombre, int anho, String nombreRevista, int volumen, int paginaInicial, int paginaFinal) {
        super(nombre, anho);
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
