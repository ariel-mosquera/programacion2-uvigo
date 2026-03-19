package ejercicio2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TipoCuentaTest {

    @Test
    void testComisionCorriente() {
        assertEquals(0.5, TipoCuenta.CORRIENTE.getComisionMensual(), 0.001);
    }

    @Test
    void testComisionAhorro() {
        assertEquals(0.0, TipoCuenta.AHORRO.getComisionMensual(), 0.001);
    }

    @Test
    void testComisionPremium() {
        assertEquals(2.0, TipoCuenta.PREMIUM.getComisionMensual(), 0.001);
    }
}
