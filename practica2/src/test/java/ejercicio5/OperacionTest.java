package ejercicio5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OperacionTest {

    @Test

    public void testSuma() {
        assertEquals(15, Operacion.SUMA.calcular(10, 5), 0.001);
        assertEquals(-15, Operacion.SUMA.calcular(-10, -5), 0.001);
        assertEquals(7.5, Operacion.SUMA.calcular(2.5, 5), 0.001);
    }

    @Test

    public void testResta() {
        assertEquals(0, Operacion.RESTA.calcular(5, 5), 0.001);
        assertEquals(-1, Operacion.RESTA.calcular(2, 3), 0.001);
        assertEquals(3, Operacion.RESTA.calcular(1, -2));
    }

    @Test

    public void testMultiplicacion() {
        assertEquals(-10, Operacion.MULTIPLICACION.calcular(-1, 10));
        // assertEquals(25, );
    }

}
