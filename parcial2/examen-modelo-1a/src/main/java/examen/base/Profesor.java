package examen.base;

public class Profesor {

    private String nombre;
    private String email;

    public Profesor(String nombre, String email) {
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
        return "Profesor[" + nombre + ", " + email + "]";
    }
}
