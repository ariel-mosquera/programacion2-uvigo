package ejercicio3;

import ejercicio2.TipoCuenta;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests para la clase Cliente.
//
// Se deben escribir tests que comprueben:
//
// 1. Que el constructor crea el cliente correctamente y los getters devuelven los valores esperados.
// 2. Que el constructor lanza IllegalArgumentException con un dni inválido (null o vacío).
// 3. Que saldoNetoMensual() devuelve el saldo menos la comisión mensual del tipo de cuenta.

class ClienteTest {

    @Test
    void constructorTest() {
        Cliente cliente = new Cliente("75836578B", "Nombre teste", 25.5, TipoCuenta.PREMIUM);

        assertEquals("75836578B", cliente.getDni());
        assertEquals("Nombre teste", cliente.getNombre());
        assertEquals(25.5, cliente.getSaldo(), 0.001);
        assertEquals(TipoCuenta.PREMIUM, cliente.getTipoCuenta());
        assertEquals(1, Cliente.getTotalClientes());
    }

    @Test
    void dniInvalidoTest() throws IllegalArgumentException {
        /*
         * try {
         * Cliente cliente = new Cliente(null, "Ariel Mosquera", 50.0,
         * TipoCuenta.AHORRO);
         * assertEquals(1, 0);
         * } catch (IllegalArgumentException e) {
         * assertEquals(1, 1);
         * }
         */
        assertThrows(IllegalArgumentException.class, () -> new Cliente(null, "nombre", 50.0, TipoCuenta.AHORRO));
    }

    @Test
    void saldoNetoMensual() {
        Cliente cliente1 = new Cliente("12345678A", "Pepe", 25.5, TipoCuenta.PREMIUM);
        Cliente cliente2 = new Cliente("87654321B", "Maria", 53.00, TipoCuenta.CORRIENTE);
        Cliente cliente3 = new Cliente("97867476C", "Jose", 100.0, TipoCuenta.AHORRO);

        assertEquals(23.5, cliente1.saldoNetoMensual(), 0.001);
        assertEquals(52.5, cliente2.saldoNetoMensual(), 0.001);
        assertEquals(100, cliente3.saldoNetoMensual(), 0.001);
    }
}
