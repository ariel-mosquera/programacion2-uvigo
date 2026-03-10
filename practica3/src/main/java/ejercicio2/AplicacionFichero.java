package ejercicio2;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class AplicacionFichero {
    public static void main(String[] args) {
        System.out.println("Indica la ruta al fichero a operar: ");
        Scanner entrada = new Scanner(System.in);
        String rutaFichero = entrada.nextLine();

        Path fichero = Path.of(rutaFichero);
        OperadorFichero operadorFichero = null;

        while (operadorFichero == null) {
            try {
                operadorFichero = new OperadorFichero(fichero);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Contenidos del fichero: " + fichero);

        try {
            System.out.println(operadorFichero.leerFichero());
        } catch (IOException e) {
            System.out.println("No se pudo abrir el fichero");

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
            System.out.println("No tienes acceso al fichero");
        } catch (IOException e) {
            System.out.println("Ha surgido un error en el fichero");
        } finally {
            System.out.println("Que tengas un buen día");
            entrada.close();
        }
    }
}