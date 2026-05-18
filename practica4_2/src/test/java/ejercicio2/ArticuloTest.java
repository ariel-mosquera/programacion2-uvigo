package ejercicio2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import ejercicio1.Autor;

public class ArticuloTest {

    @Test
    void testConstructorArticulo() {
        Autor autor = new Autor("orcid", "Nombre", "Apellidos", "Instituicion");
        Articulo articulo = new Articulo(autor, "Titulo", 2026, 7, "Revista", 5, 10, 20);

        assertEquals(autor.getOrcid(), articulo.getPrimerAutor().getOrcid());
        assertEquals("Titulo", articulo.getTitulo());
        assertEquals(2026, articulo.getAnho());
        assertEquals(7, articulo.getNumCitas());
        assertEquals("Revista", articulo.getNombreRevista());
        assertEquals(5, articulo.getVolumen());
        assertEquals(10, articulo.getPaginaInicial());
        assertEquals(20, articulo.getPaginaFinal());
    }
}