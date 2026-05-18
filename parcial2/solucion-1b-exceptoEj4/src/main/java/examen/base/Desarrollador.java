package examen.base;

public abstract class Desarrollador {

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

    abstract int getHorasMaximas();

    @Override
    public String toString() {
        return "Desarrollador[" + nombre + ", " + email + "]";
    }
}
