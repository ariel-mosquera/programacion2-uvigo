package ejercicio7;

public class Deportista {
    private String dni;
    private String nombre;
    private Categoria categoria;

    public Deportista(String nombre, String dni, Categoria categoria) {
        this.nombre = nombre;
        setDni(dni);
        this.categoria = categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    private void setDni(String dni) {
        if (dni.length() != 9) {
            System.out.println("¡Error! DNI inválido, finalizando programa...");
            System.exit(1);
        }
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {

        return """
                Nombre: %s
                DNI: %s
                Categoria: %s""".formatted(nombre, dni, categoria);
    }

}
