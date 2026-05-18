package ejercicio2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import ejercicio1.Autor;

public class ComunicacionEnCongresoTest {

    @Test
    void testConstructorComunicacionEnCongreso() {
        Autor autor = new Autor("orcid", "Nombre", "Apellidos", "Instituicion");
        ComunicacionEnCongreso comunicacion = new ComunicacionEnCongreso(autor, "Titulo", 2025, 2, "CongresoX",
                "CiudadY",
                "PaisZ");

        assertEquals(autor.getOrcid(), comunicacion.getPrimerAutor().getOrcid());
        assertEquals("Titulo", comunicacion.getTitulo());
        assertEquals(2025, comunicacion.getAnho());
        assertEquals(2, comunicacion.getNumCitas());
        assertEquals("CongresoX", comunicacion.getNombreCongreso());
        assertEquals("CiudadY", comunicacion.getCiudad());
        assertEquals("PaisZ", comunicacion.getPais());
    }
}
