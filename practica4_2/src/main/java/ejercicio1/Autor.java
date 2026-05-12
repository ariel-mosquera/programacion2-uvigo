package ejercicio1;

public class Autor {
    private final String orcid;
    private final String nombre;
    private final String apellidos;
    private final String institucion;

    public Autor(String orcid, String nombre, String apellidos, String institucion) {
        this.orcid = orcid;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.institucion = institucion;
    }

    public String getOrcid() {
        return orcid;
    }

    public String getNombrere() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getInstitucion() {
        return institucion;
    }

}
