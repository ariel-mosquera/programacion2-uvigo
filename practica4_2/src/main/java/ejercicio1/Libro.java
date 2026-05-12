package ejercicio1;

public class Libro extends Publicacion {
    private final String editorial;
    private final String lugar;

    public Libro(String nombre, int anho, String editorial, String lugar) {
        super(nombre, anho);
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
                Nombre: %s
                Anho: %d
                Editorial: %s
                Lugar: %s
                 """.formatted(super.getNombre(), super.getAnho(), this.getEditorial(), this.getLugar());
    }
}
