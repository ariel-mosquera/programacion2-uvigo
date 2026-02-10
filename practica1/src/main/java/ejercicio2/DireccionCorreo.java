package ejercicio2;

public class DireccionCorreo {

    // atributos
    String servidor;
    String nombre;
    String apellidos;
    String usuario;
    static final String SERVIDOR = "esei.uvigo.es";

    // constructor
    public DireccionCorreo(String servidor, String nombre, String apellidos, String usuario) {
        this.servidor = servidor;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
    }

    public DireccionCorreo(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;

        nombre = nombre.toLowerCase();
        apellidos = apellidos.toLowerCase();

        String primerApellido = apellidos.split(" ")[0];
        // String segundoApellido = apellidos.split(" ")[1];
        char inicial = nombre.charAt(0);

        this.usuario = inicial + primerApellido;
        this.servidor = SERVIDOR;
    }

    // toString
    @Override
    public String toString() {
        return apellidos + ',' + nombre + ": " + usuario + '@' + servidor;
    }

}
