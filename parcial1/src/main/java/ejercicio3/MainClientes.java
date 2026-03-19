package ejercicio3;

import ejercicio2.TipoCuenta;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class MainClientes {

    private static int leerEntero(Scanner scanner, String mensaje) {
        while (true) {

            System.out.print(mensaje);
            String linea = scanner.nextLine();

            try {
                return Integer.parseInt(linea);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Introduzca un número entero.");
            }
        }
    }

    private static TipoCuenta leerTipoCuenta(Scanner scanner) {

        TipoCuenta[] valores = TipoCuenta.values();

        System.out.println("Tipos de cuenta disponibles:");
        for (int i = 0; i < valores.length; i++)
            System.out.println("  " + i + ". " + valores[i] + " (comisión: " + valores[i].getComisionMensual() + " €/mes)");

        while (true) {
            int opcion = leerEntero(scanner, "Seleccione tipo de cuenta (0-" + (valores.length - 1) + "): ");

            if (opcion >= 0 && opcion < valores.length)
                return valores[opcion];

            System.out.println("Opción no válida. Introduzca un número entre 0 y " + (valores.length - 1) + ".");
        }
    }

    // COMPLETAR: hacer robusto este método: capturar los errores de validación,
    // mostrar su mensaje al usuario y repetir la lectura hasta que los datos sean
    // válidos

    private static Cliente leerCliente(Scanner scanner) {

        boolean clienteValido = false;
        Cliente nuevoCliente = null;

        do {
            System.out.print("DNI: ");
            String dni = scanner.nextLine();

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            double saldo = 0.0;
            while (true) {
                System.out.print("Saldo: ");
                String lineaSaldo = scanner.nextLine();
                try {
                    saldo = Double.parseDouble(lineaSaldo);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Saldo no válido. Introduzca un número decimal.");
                }
            }

            TipoCuenta tipoCuenta = leerTipoCuenta(scanner);
            try {
                nuevoCliente = new Cliente(dni, nombre, saldo, tipoCuenta);
                clienteValido = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + ", vuelve a introducir los datos...");
            }
        } while (!clienteValido);

        return nuevoCliente;
    }

    public static void main(String[] args) {
        OperadorFichero operadorFichero = new OperadorFichero(Path.of("clientes.txt"));

        Scanner scanner = new Scanner(System.in);
        String respuesta = "n";
        do {
            Cliente cliente = leerCliente(scanner);

            // COMPLETAR: agregar el toString() del cliente al fichero mediante
            // operadorFichero.
            // Si se produce un error de entrada/salida, el error debe interrumpir el
            // programa
            // mostrando al usuario un mensaje amigable (p.ej: "se ha producido un error de
            // entrada/salida: <descripcion>")
            // con la descripción del error contenida en la excepción (sin mostrar la
            // traza).
            // Es decir, no se deberán seguir pidiendo más clientes.

            try {
                operadorFichero.agregarLinea(cliente.toString());

                System.out.println("Cliente creado: " + cliente);

                System.out.print("¿Desea añadir otro cliente? (s/n): ");
                respuesta = scanner.nextLine();

            } catch (IOException e) {
                System.out.println("se ha producido un error de entrada/salida:" + e.getCause());
            }

        } while (respuesta.equalsIgnoreCase("s"));

        scanner.close();
    }
}
