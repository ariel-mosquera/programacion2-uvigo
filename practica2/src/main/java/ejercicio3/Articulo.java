package ejercicio3;

public class Articulo {
    private String nombre;
    private double precio;
    private TipoIVA tipoIVA;

    public Articulo(String nombre, double precio, TipoIVA tipoIVA) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipoIVA = tipoIVA;
    }

    /*
     * private double calcularPrecioFinal() {
     * return switch (tipoIVA) {
     * case GENERAL -> this.precio * (1.0 + 0.21);
     * case REDUCIDO -> this.precio * (1.0 + 0.10);
     * case SUPERREDUCIDO -> this.precio * (1.0 + 0.04);
     * case EXENTO -> this.precio;
     * };
     * }
     */

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public TipoIVA getTipoIVA() {
        return this.tipoIVA;
    }

    @Override
    public String toString() {

        return """
                Artículo: %s
                Precio final: %f euros
                """.formatted(nombre, tipoIVA.calcularPrecioFinal(precio));
    }
}
