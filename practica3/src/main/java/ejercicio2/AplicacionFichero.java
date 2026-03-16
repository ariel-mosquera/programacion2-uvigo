package ejercicio2;

import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Path;
import java.util.Scanner;

public class AplicacionFichero {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        boolean ficheroValido = false;
        String rutaFichero = null;
        Path fichero = null;
        OperadorFichero operadorFichero = null;
        try {
            do {
                System.out.println("Indica la ruta al fichero a operar: ");
                rutaFichero = entrada.nextLine();
                fichero = Path.of(rutaFichero);

                try {
                    operadorFichero = new OperadorFichero(fichero);
                    ficheroValido = true;
                } catch (IllegalArgumentException e) {
                    System.err.println("Dirección inválida vuelve a intentarlo...");
                }

            } while (!ficheroValido);

            System.out.println("Contenidos del fichero: " + fichero);
            System.out.println(operadorFichero.leerFichero());

            String linea = null;

            do {
                System.out.println("Añadamos una línea al fichero (linea vacía si quieres terminar): ");
                linea = entrada.nextLine().trim();

                if (linea.length() > 0) {
                    operadorFichero.añadirTexto(linea + "\n");
                    System.out.println("Línea añadida");
                }

            } while (linea.length() > 0);

            System.out.println("Contenidos del fichero: " + fichero);

            System.out.println(operadorFichero.leerFichero());
        } catch (AccessDeniedException e) {
            System.err.println("Acceso al archivo fue negado");
        } catch (IOException e) {
            System.err.println("Error al acceder el fichero, error de entrada/salida... " + e.getMessage());
        } finally {
            entrada.close();
            System.out.println("Que tengas un buen día");
        }

    }
}