package ejercicio3;

import ejercicio1.Autor;
import ejercicio2.*;

import java.util.ArrayList;

public class RegistroPublicacionesAutor {
    private Autor autor;
    private ArrayList<Publicacion> publicaciones;

    public RegistroPublicacionesAutor(Autor autor) {
        this.autor = autor;
        this.publicaciones = new ArrayList<>();
    }

    public Autor getAutor() {
        return autor;
    }

    public void agregarPublicacion(Publicacion publicacion) {
        this.publicaciones.add(publicacion);
    }

    public double calcularIndiceC() {
        int citasArt = 0;
        int citasLib = 0;
        int citasCom = 0;

        for (Publicacion publicacion : publicaciones) {
            if (publicacion instanceof Articulo)
                citasArt += publicacion.getNumCitas();
            else if (publicacion instanceof Libro)
                citasLib += publicacion.getNumCitas();
            else
                citasCom += publicacion.getNumCitas();
        }

        return citasArt + (citasLib * 0.8) + (citasCom * 0.6);
    }

}
