package ejercicio2;

public class Employee {
    private final String name;
    private final String email;

    public Employee(String nombre, String correo) {
        this.name = nombre;
        this.email = correo;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
