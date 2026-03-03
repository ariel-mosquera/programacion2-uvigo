package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Deportista[] array = new Deportista[10];
        int[] pos = new int[1];
        pos[0] = 0;
        var opt = 0;

        do {
            opt = menu(scanner);
            switch (opt) {
            case 1 -> agregarDeportista(array, pos, scanner);
            case 2 -> listarDeportistas(array, pos);
            case 3 -> obtenerDeportista(array, pos, scanner);
            case 4 -> obtenerEstadisticas(array, pos);
            case 5 -> System.out.println("\nFinalizando programa...");
            default -> System.out.println("\nValor inválido");
            }
        } while (opt != 5);
    }

    public static void agregarDeportista(Deportista[] array, int[] pos, Scanner scanner) {
        String dni;
        String nombre;
        Categoria categoria;
        int opt;

        for (int i = pos[0]; i < array.length; i++) {

            System.out.println("\nDeportista [" + (i + 1) + "]");

            System.out.print("\nNombre (vacío para rematar): ");
            nombre = scanner.nextLine();

            if (verificarNombre(nombre)) {
                System.out.println("Volviendo al menú...");
                break;
            }

            System.out.print("\nDNI: ");
            dni = scanner.nextLine();

            System.out.println("""
                    \nElige una Categoria:

                      (1) -> Benjamin
                      (2) -> Alevin
                      (3) -> Infantil
                      (4) -> Cadete
                      (5) -> Juvenil
                      (6) -> Senior
                              """);

            do {
                System.out.print("Categoria: ");
                opt = Integer.parseInt(scanner.nextLine());
            } while (opt < 1 || opt > 6);

            categoria = switch (opt) {
            case 1 -> Categoria.BENJAMIN;
            case 2 -> Categoria.ALEVIN;
            case 3 -> Categoria.INFANTIL;
            case 4 -> Categoria.CADETE;
            case 5 -> Categoria.JUVENIL;
            case 6 -> Categoria.SENIOR;
            default -> Categoria.BENJAMIN;
            };

            array[i] = new Deportista(nombre, dni, categoria);
            pos[0]++;
        }
    }

    public static boolean verificarNombre(String nombre) {
        return nombre.equals("");
    }

    public static int menu(Scanner scanner) {
        System.out.println("""
                \n=== Menú ===

                 (1) -> Agregar deportistas
                 (2) -> Listar deportistas
                 (3) -> Obtener deportista
                 (4) -> Estadísticas
                 (5) -> Salir
                 """);
        System.out.print("Opcion: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static void listarDeportistas(Deportista[] array, int[] pos) {

        if (pos[0] == 0)
            System.out.println("Array vacío, volviendo al menú...");
        else {
            for (int i = 0; i < pos[0]; i++) {
                System.out.println("\nDeportista [" + (i + 1) + "]");
                System.out.println(array[i]);
            }
        }
    }

    public static void obtenerDeportista(Deportista[] array, int[] pos, Scanner scanner) {
        int indice;

        System.out.println("""
                \n=== Buscar deportista ===

                  A continuación introduce el indice del deportista buscado,
                  actualmente están registrados un total de %d deportistas""".formatted(pos[0]));

        do {
            System.out.print("\nIndice: ");
            indice = Integer.parseInt(scanner.nextLine());

            if (indice <= 0 || indice >= (pos[0] + 1))
                System.out.println("Valor inválido, no se admiten números negativos, el número cero o valores mayores que el número de elementos");

        } while (indice <= 0 || indice >= (pos[0] + 1));

        System.out.println("\nDeportista [" + indice + "]:");
        System.out.println(array[indice - 1]);
    }

    public static void obtenerEstadisticas(Deportista[] array, int[] pos) {
        System.out.println("""
                \n=== Estadísticas ===

                  Total de deportistas registrados: %d
                  Total de espacios disponibles: %d""".formatted(pos[0], (array.length - pos[0])));
    }
}
