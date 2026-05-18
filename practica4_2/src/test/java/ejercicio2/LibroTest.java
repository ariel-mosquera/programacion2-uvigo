package ejercicio2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import ejercicio1.Autor;

public class LibroTest {

    @Test
    void testConstructorLibro() {
        Autor autor = new Autor("orcid", "Nombre", "Apellidos", "Instituicion");

        Libro libro = new Libro(autor, "Titulo", 2026, 1, "EditorialX", "LugarY");

        assertEquals(autor.getOrcid(), libro.getPrimerAutor().getOrcid());
        assertEquals("Titulo", libro.getTitulo());
        assertEquals(2026, libro.getAnho());
        assertEquals(1, libro.getNumCitas());
        assertEquals("EditorialX", libro.getEditorial());
        assertEquals("LugarY", libro.getLugar());

    }
}