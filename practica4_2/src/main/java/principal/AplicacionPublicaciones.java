package principal;

import ejercicio1.Autor;
import ejercicio2.*;
import ejercicio3.RegistroPublicacionesAutor;

import java.util.ArrayList;

public class AplicacionPublicaciones {
    public static void main(String[] args) {
        ArrayList<Publicacion> publicaciones = new ArrayList<>();

        Autor autor = new Autor("orcid", "Ariel", "Mosquera Ribeiro", "ESEI");

        Articulo articulo = new Articulo(autor, "Articulo", 2026, 3, "Inovaciones26", 3, 1, 20);
        ComunicacionEnCongreso comunicacion = new ComunicacionEnCongreso(autor, "Comunicacion", 2025, 4, "CongresoX", "CiudadY", "PaisZ");
        Libro libro = new Libro(autor, "Libro", 2024, 0, "EditorialX", "LugarY");

        RegistroPublicacionesAutor registro = new RegistroPublicacionesAutor(autor);

        publicaciones.add(articulo);
        publicaciones.add(comunicacion);
        publicaciones.add(libro);

        for (Publicacion publicacion : publicaciones)
            registro.agregarPublicacion(publicacion);

        for (Publicacion publicacion : publicaciones)
            System.out.println(publicacion);

        System.out.println("Indice de citas: " + registro.calcularIndiceC());
    }
}
