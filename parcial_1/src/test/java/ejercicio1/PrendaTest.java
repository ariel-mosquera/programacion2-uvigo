package ejercicio1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrendaTest {

    @Test
    void constructorTest() {
        Prenda prenda = new Prenda("camiseta", 36, 27.67);
        assertEquals("camiseta", prenda.getNombre());
        assertEquals(36, prenda.getTalla());
        assertEquals(27.67, prenda.getPrecio(), 0.001);
    }

    @Test
    void prendaBasicaTest() {
        Prenda prenda = Prenda.prendaBasica("chaqueta");
        assertEquals(false, prenda.esCara());
    }
}
