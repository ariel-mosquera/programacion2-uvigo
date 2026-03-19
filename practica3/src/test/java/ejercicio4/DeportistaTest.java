package ejercicio4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import static org.junit.jupiter.api.Assertions.*;

public class DeportistaTest {

    @Test
    void constructorTest() {
        Deportista deportista = new Deportista("12345678A", "Nombre Test", 27);
        assertEquals("12345678A", deportista.getDni());
        assertEquals("Nombre Test", deportista.getNombre());
        assertEquals(27, deportista.getEdad());
        assertEquals(Categoria.SENIOR, deportista.getCategoria());
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { "123456789A", "1234567B" })
    void dniInvalidoTest(String dni) {
        assertThrows(IllegalArgumentException.class, () -> {
            new Deportista(dni, "Nombre test", 20);
        });
    }

    @ParameterizedTest
    @NullAndEmptySource
    void nombreInvalidoTest(String nombre) {
        assertThrows(IllegalArgumentException.class, () -> {
            new Deportista("12345678A", nombre, 20);
        });
    }

    @Test
    void edadInvalidaTest() {
        int edadInvalida = -5;
        assertThrows(IllegalArgumentException.class, () -> {
            new Deportista("12345678L", "Nombre test", edadInvalida);
        });
    }
}
