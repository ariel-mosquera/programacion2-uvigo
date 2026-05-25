package ejercicio2;

import java.util.Scanner;
import java.util.ArrayList;

public class Programa {

    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Operacion> operaciones;

    public Programa(ArrayList<Operacion> operaciones) {
        this.operaciones = operaciones;
    }

    public void iniciar() {
        int opcion = 0;
        int tamanhoOperaciones = operaciones.size();
        boolean valido = true;

        while (opcion != tamanhoOperaciones && valido) {
            System.out.println("\n=== Menú ===\n");

            for (Operacion operacion : operaciones)
                System.out.printf("Opción (%d) -- %s\n", (operaciones.indexOf(operacion) + 1), operacion.getDescripcion());

            System.out.print("\nOpción: ");
            opcion = leerEntero();

            if (opcion >= 1 && opcion <= tamanhoOperaciones)
                operaciones.get(opcion - 1).ejecutar();
            else {
                System.out.println("Opción inválida");
                valido = false;
            }
        }
    }

    private int leerEntero() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Por favor, introduce un número: ");
            }
        }
    }
}