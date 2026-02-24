package ejercicio3;

import org.junit.jupiter.api.Test; // para que sepa que es un test
import static org.junit.jupiter.api.Assertions.*; // librerias de los asserts

public class ArticuloTest {

    @Test

    public void testCalcularPrecioIVAGeneral() {
        double precioBase = 100.00;
        double precioEsperado = 121.00;
        double precioCalculado = TipoIVA.GENERAL.calcularPrecioFinal(precioBase);

        assertEquals(precioEsperado, precioCalculado, 0.001);
    }

    @Test

    public void testCalcularPrecioIVASuperreducido() {
        double precioBase = 25;
        double precioEsperado = 26;
        double precioCalculado = TipoIVA.SUPERREDUCIDO.calcularPrecioFinal(precioBase);

        assertEquals(precioEsperado, precioCalculado, 0.001);
    }

    @Test

    public void testCalcularPrecioIVAReducido() {
        double precioBase = 50;
        double precioEsperado = 55;
        double precioCalculado = TipoIVA.REDUCIDO.calcularPrecioFinal(precioBase);

        assertEquals(precioEsperado, precioCalculado, 0.001);
    }

    @Test

    public void testCalcularPrecioIVAExento() {
        double precioBase = 10;
        double precioEsperado = 10;
        double precioCalculado = TipoIVA.EXENTO.calcularPrecioFinal(precioBase);

        assertEquals(precioEsperado, precioCalculado, 0.001);
    }

    @Test

    public void testGetPorcentajeGeneral() {
        assertEquals(0.21, TipoIVA.GENERAL.getPorcentaje());
    }
}
