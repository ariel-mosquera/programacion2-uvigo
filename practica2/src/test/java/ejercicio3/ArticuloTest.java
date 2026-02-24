package ejercicio3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArticuloTest {

    @Test

    void testPrecioFinal() {
        Articulo articulo = new Articulo("RAM", 5.25, TipoIVA.GENERAL);

        var resultado = articulo.getTipoIVA().calcularPrecioFinal(articulo.getPrecio());

        assertEquals(6.5625, resultado, 0.01, "El precio final deberia ser aprox. 6.5625");
    }

    void testPrecioNegativo() {
        Articulo articulo = new Articulo("NVIDIA GTX 5090", -55, TipoIVA.REDUCIDO);
    }
}
