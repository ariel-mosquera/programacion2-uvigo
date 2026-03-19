package ejercicio5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.StandardOpenOption;
import java.nio.file.Files;
import java.nio.file.Path;

public class OperadorFicheroTest {

    @Test
    void leerFicheroTest() throws IOException {

        Path tempPath = Files.createTempFile("fichero-", ".txt");
        Files.write(tempPath, "Test del método".getBytes(), StandardOpenOption.APPEND);

        OperadorFichero operador = new OperadorFichero(tempPath);
        assertEquals("Test del método", operador.leerFichero());

    }

    @Test
    void anadirTextoTest() throws IOException {

        Path tempPath = Files.createTempFile("fichero-", ".txt");
        OperadorFichero operador = new OperadorFichero(tempPath);

        operador.anadirTexto("test de escritura de texto");

        String esperado = "test de escritura de texto";

        assertEquals(esperado, operador.leerFichero());
    }

    @Test
    void constructorConFicheroInexistenteTest() {
        Path falso = Path.of("archivo_falso.txt");

        assertThrows(IllegalArgumentException.class, () -> {
            new OperadorFichero(falso);
        });
    }

    @Test
    void escribirEnArchivoInexistente() throws IOException {

        Path tempPath = Files.createTempFile("fichero-temp", ".txt");

        OperadorFichero operador = new OperadorFichero(tempPath);

        Files.delete(tempPath);

        assertThrows(IOException.class, () -> {
            operador.anadirTexto("teste");
        });
    }

    @Test
    void leerArchivoInexistente() throws IOException {

        Path tempPath = Files.createTempFile("fichero-test", ".txt");

        OperadorFichero operador = new OperadorFichero(tempPath);

        Files.delete(tempPath);

        assertThrows(IOException.class, () -> {
            operador.leerFichero();
        });
    }
}
