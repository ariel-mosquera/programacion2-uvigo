package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        // System.out.println("Aprendiendo java");

        // System.out.println("Esto es una " + "\n prueba " + "\n ultima linea");

        // System.out.println("""
        // Esto es una prueba de un text block
        // Ultima Linea
        // """);

        int edad;
        String nombre;
        double nota;
        String temp;

        var entrada = new Scanner(System.in);

        System.out.print("Introduce nombre: ");

        nombre = entrada.nextLine();

        System.out.print("Introduce la edad: ");
        temp = entrada.nextLine();
        edad = Integer.parseInt(temp);

        System.out.print("Introduce nota: ");
        temp = entrada.nextLine();
        nota = Double.parseDouble(temp);

        System.out.println("\nLos datos son \n Nombre: " + nombre + "\t Edad: " + edad + "\t Nota: " + nota);

        entrada.close();
    }
}
