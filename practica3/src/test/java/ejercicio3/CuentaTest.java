package ejercicio3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CuentaTest {

    @Test
    void constructorTest() {
        Cuenta cuenta = new Cuenta(237.39);
        assertEquals(237.39, cuenta.getSaldo());
    }

    @Test
    void setterTest() {
        Cuenta cuenta = new Cuenta(5489.99);
        cuenta.setSaldo(49.50);
        assertEquals(49.50, cuenta.getSaldo());
    }

    // Tests de excepciones

    @Test
    void argumentoInvalidoTest() {
        Cuenta cuenta = new Cuenta(27);

        assertThrows(IllegalArgumentException.class, () -> {
            new Cuenta(-10);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            cuenta.setSaldo(-57);
        });
    }
}
