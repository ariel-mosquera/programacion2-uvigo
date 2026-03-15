package ejercicio6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumeroComplejoTest {

    @Test

    public void testSumar() {
        NumeroComplejo num1 = new NumeroComplejo(1, 1);
        NumeroComplejo num2 = new NumeroComplejo(3, 4);
        NumeroComplejo esperado = new NumeroComplejo(4, 5);
        NumeroComplejo calculado = num1.sumar(num2);

        assertEquals(esperado.getParteRe(), calculado.getParteRe());
        assertEquals(esperado.getParteIm(), calculado.getParteIm());
    }

    @Test

    public void testMultiplicarPorReal() {
        NumeroComplejo complejo = new NumeroComplejo(5, 7);
        NumeroComplejo esperado = new NumeroComplejo(10, 14);
        NumeroComplejo calculado = complejo.multiplicarPorReal(2);

        assertEquals(esperado.getParteRe(), calculado.getParteRe());
        assertEquals(esperado.getParteIm(), calculado.getParteIm());
    }

    @Test

    public void testCalcularValorAbsoluto() {
        NumeroComplejo complejo = new NumeroComplejo(4, 3);
        double esperado = 5.00;
        double calculado = complejo.calcularValorAbsoluto();

        assertEquals(esperado, calculado);

        complejo = complejo.multiplicarPorReal(-1);
        assertEquals(5.00, complejo.calcularValorAbsoluto());
    }

    @Test

    public void testReal() {
        NumeroComplejo complejo = NumeroComplejo.real(5);
        assertEquals(5, complejo.getParteRe());
    }

    @Test

    public void testImaginario() {
        NumeroComplejo complejo = NumeroComplejo.imaginario(7);
        assertEquals(7, complejo.getParteIm());
        NumeroComplejo complejo2 = NumeroComplejo.imaginario(1);
        assertEquals(NumeroComplejo.I.getParteIm(), complejo2.getParteIm());
    }
}