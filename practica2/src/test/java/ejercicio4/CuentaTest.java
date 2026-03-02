package ejercicio4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class CuentaTest {

    @BeforeEach
    void resetearEstadoGlobal() {
        Cuenta.resetSaldoTotalParaTests();
    }

    @Test

    public void testIngresarDinero() {
        Cuenta cuenta1 = new Cuenta(100);
        cuenta1.ingresarDinero(55);
        assertEquals(155, cuenta1.getSaldo(), "Fallo en el método ingresarDinero");

        Cuenta cuenta2 = new Cuenta(173);
        cuenta2.ingresarDinero(7);
        assertEquals(180, cuenta2.getSaldo(), "Fallo en el método ingresarDinero...");

        // test Saldo total

        assertEquals(335, Cuenta.getSaldoTotal(), "Fallo en el cálculo del saldo total");
    }

    @Test

    public void testRetirarDinero() {
        Cuenta cuenta1 = new Cuenta(250);
        cuenta1.retirarDinero(33);
        assertEquals(217, cuenta1.getSaldo());

        Cuenta cuenta2 = new Cuenta(27);
        cuenta2.retirarDinero(5);
        assertEquals(22, cuenta2.getSaldo());

        // Test saldo Total

        assertEquals(239, Cuenta.getSaldoTotal());
    }
}
