package examen.base;

public class Desarrollador {

    private String nombre;
    private String email;

    public Desarrollador(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Desarrollador[" + nombre + ", " + email + "]";
    }
}
