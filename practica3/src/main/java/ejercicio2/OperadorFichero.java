package ejercicio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

class OperadorFichero {
    private Path fichero;

    public OperadorFichero(Path fichero) throws IllegalArgumentException {
        if (!Files.exists(fichero))
            throw new IllegalArgumentException();

        this.fichero = fichero;
    }

    public String leerFichero() throws IOException {
        return new String(Files.readAllBytes(this.fichero));
    }

    public void añadirTexto(String texto) throws IOException {
        Files.write(this.fichero, texto.getBytes(), StandardOpenOption.APPEND);
    }
}