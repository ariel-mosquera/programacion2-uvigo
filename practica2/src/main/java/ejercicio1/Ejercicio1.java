package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Libro[] vectorLibros = new Libro[4];
        var contadorLibros = 0;

        // Creando libros manualmente

        vectorLibros[contadorLibros] = new Libro("Title", "Yo", "nose", 1999, "12345", TipoLibro.HISTORIA);
        contadorLibros++;

        vectorLibros[contadorLibros] = new Libro("Tortugas ninja 3", "Pepito", "Scadush", 1998, "54321",
                TipoLibro.NOVELA);
        contadorLibros++;

        System.out.println("\n=== Titulos de los libros ===");

        for (int i = 0; i < contadorLibros; i++) {
            System.out.println("\nLibro (" + i + ")");
            System.out.println(vectorLibros[i].getTitulo());
        }

        System.out.println("\n=== Creando nuevos libros ===\n");

        System.out.println("Libro (2)");
        vectorLibros[contadorLibros++] = crearLibroDesdeConsola(teclado);

        System.out.println("Libro (3)");
        vectorLibros[contadorLibros++] = crearLibroDesdeConsola(teclado);

        System.out.println("\n=== Visulizar libros ===\n");

        for (int i = 0; i < contadorLibros; i++) {
            System.out.println("\nLibro (" + i + ")");
            System.out.println(vectorLibros[i]);
        }

        teclado.close();
    }

    static TipoLibro pedirTipoLibro(Scanner scanner) {

        int opt;

        do {
            System.out.println("""
                    Introduce el tipo de libro:
                    (1) --> Novela
                    (2) --> Historia
                    (3) --> Tecnologia
                    """);

            System.out.print("Opción: ");
            opt = Integer.parseInt(scanner.nextLine());

            if (opt < 0 || opt > 3)
                System.out.println("Valor inválido, vuelve a introducir...");

        } while (opt < 0 || opt > 3);

        return switch (opt) {
            case 1 -> TipoLibro.NOVELA;
            case 2 -> TipoLibro.HISTORIA;
            case 3 -> TipoLibro.TECNOLOGIA;
            default -> TipoLibro.TECNOLOGIA; // No se que poner en el default, pero el compilador me obliga a poner algo
        };
    }

    static Libro crearLibroDesdeConsola(Scanner scanner) {

        System.out.print("Introduce el título: ");
        String titulo = scanner.nextLine();

        System.out.print("Introduce los autores: ");
        String autores = scanner.nextLine();

        System.out.print("Introduce la editorial: ");
        String editorial = scanner.nextLine();

        System.out.print("Introduce el año de edición: ");
        int anho = Integer.parseInt(scanner.nextLine());

        System.out.print("Introduce el ISBN: ");
        String isbn = scanner.nextLine();

        TipoLibro tipo = pedirTipoLibro(scanner);

        return new Libro(titulo, autores, editorial, anho, isbn, tipo);
    }
}