package ejercicio2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

class OperadorFichero {
    private Path fichero;

    public OperadorFichero(Path fichero) throws FileNotFoundException {
        // TODO: Controlemos aqui si el fichero no existe
        this.fichero = fichero;
    }

    public String leerFichero() throws IOException {
        try {
            return new String(Files.readAllBytes(this.fichero));
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public void añadirTexto(String texto) throws IOException {
        Files.write(this.fichero, texto.getBytes(), StandardOpenOption.APPEND);
    }
}