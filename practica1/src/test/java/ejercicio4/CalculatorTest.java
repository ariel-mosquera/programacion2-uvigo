package ejercicio4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void testAdd() {
        // 1. Preparar: Crear objetos necesarios
        Calculator calc = new Calculator();

        // 2. Ejecutar: Llamar al método que queremos probar
        int resultado = calc.add(2, 3);

        // 3. Comprobar: Verificar que el resultado es el esperado
        assertEquals(5, resultado);
    }
}
