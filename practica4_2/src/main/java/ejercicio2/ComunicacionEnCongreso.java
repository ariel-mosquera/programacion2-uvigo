package ejercicio2;

import ejercicio1.Autor;

public class ComunicacionEnCongreso extends Publicacion {
    private final String nombreCongreso;
    private final String ciudad;
    private final String pais;

    public ComunicacionEnCongreso(Autor autor, String titulo, int anho, int numCitas, String nombreCongreso,
            String ciudad,
            String pais) {
        super(autor, titulo, anho, numCitas);
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
