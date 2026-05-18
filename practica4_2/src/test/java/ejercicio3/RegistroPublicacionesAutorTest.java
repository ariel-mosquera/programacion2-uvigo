package ejercicio3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import ejercicio1.Autor;
import ejercicio2.*;

public class RegistroPublicacionesAutorTest {
    @Test
    void testCalcularIndiceC() {
        Autor autor = new Autor("orcid", "Nombre", "Apellidos", "Institucion");

        RegistroPublicacionesAutor registro = new RegistroPublicacionesAutor(autor);

        Articulo articulo = new Articulo(autor, "Art1", 2022, 10, "Rev", 1, 1, 5);
        Libro libro = new Libro(autor, "Lib1", 2020, 5, "Ed", "Lugar");
        ComunicacionEnCongreso com = new ComunicacionEnCongreso(autor, "Com1", 2021, 2, "Cong", "Ciudad", "Pais");

        registro.agregarPublicacion(articulo);
        registro.agregarPublicacion(libro);
        registro.agregarPublicacion(com);

        double expected = 10 + (5 * 0.8) + (2 * 0.6); // 10 + 4 + 1.2 = 15.2

        assertEquals(expected, registro.calcularIndiceC(), 1e-9);
    }
}
