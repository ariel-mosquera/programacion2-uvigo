package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main (String [] args) {
        
        var teclado = new Scanner(System.in);
        int DNI;

        System.out.println("\nIntroduce tu DNI sin letras: ");
        DNI = teclado.nextInt();

        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        char letra = letras [(DNI % 23)];

        System.out.println("La letra del DNI " + DNI + " es " + letra + "\n");

        teclado.close();
    }
}
