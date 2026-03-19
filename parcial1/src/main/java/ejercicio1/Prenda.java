package ejercicio1;

public class Prenda {
    
    private String nombre;
    private int talla;
    private double precio;

    public Prenda(String nombre, int talla, double precio) {
        this.nombre = nombre;
        this.talla = talla;
        this.precio = precio;
    }

    public Prenda(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        talla = 38;
    }

    public static Prenda prendaBasica(String nombre) {
        return new Prenda(nombre, 38, 20.00);
    }

    public static Prenda prendaDeLujo(String nombre) {
        return new Prenda(nombre, 42, 150.00);
    }

    public String getNombre() {
        return nombre;
    }

    public int getTalla() {
        return talla;
    }

    public double getPrecio() {
        return precio;
    }

    public double precioConDescuento(double porcentaje) {
        return precio * (1 - porcentaje);
    }

    public boolean esCara() {
        if (precio > 100.00)
            return true;
        else
            return false;
    }

    @Override

    public String toString() {
        return """
                %s (talla %d) - %f
                """.formatted(nombre, talla, precio);
    }
}
