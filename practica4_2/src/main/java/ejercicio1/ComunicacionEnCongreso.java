package ejercicio1;

public class ComunicacionEnCongreso extends Publicacion {
    private final String nombreCongreso;
    private final String ciudad;
    private final String pais;

    public ComunicacionEnCongreso(String nombre, int anho, String nombreCongreso, String ciudad, String pais) {
        super(nombre, anho);
        this.nombreCongreso = nombreCongreso;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public String getNombreCongreso() {
        return nombreCongreso;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return super.toString() + """
                Congreso: %s
                Ciudad: %s
                Pais: %s
                """.formatted(this.getNombreCongreso(), this.getCiudad(), this.getPais());
    }
}
