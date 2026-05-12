package ejercicio1;

public class Publicacion {
    private final String nombre;
    private final int anho;

    public Publicacion(String nombre, int anho) {
        this.nombre = nombre;
        this.anho = anho;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getAnho() {
        return this.anho;
    }

    @Override
    public String toString() {
        return """
                Nombre: %s
                Anho: %d
                """.formatted(this.getNombre(), this.getAnho());
    }
}
