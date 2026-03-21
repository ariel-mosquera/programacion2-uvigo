package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Libro libro1 = new Libro("Harry Potter", "Yo", "Nose", 1850, "yoquese");
        
        System.out.println(libro1);

        Libro libro2 = crearLibroDesdeConsola();

        System.out.println(libro2);
    }

    static Libro crearLibroDesdeConsola() {

        Scanner entrada = new Scanner(System.in);
        String temp;

        System.out.println("A continuación introduce los datos del libro: ");

        System.out.print("\nIntroduce titulo: ");
        var titulo = entrada.nextLine();
        
        System.out.print("\nIntroduce autor: ");
        var autor = entrada.nextLine();
        
        System.out.print("\nIntroduce editorial: ");
        var editorial = entrada.nextLine();
        
        System.out.print("\nIntroduce isbn: ");
        var isbn = entrada.nextLine();

        System.out.print("\nIntroduce el año: ");
        temp = entrada.nextLine();
        var anho = Integer.parseInt(temp);
        // var anho = Integer.parseInt(nextLine());

        entrada.close();

        return new Libro(autor, titulo, editorial, anho, isbn);
    }
}
