package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String [] args) {

        Scanner miEscaner = new Scanner(System.in);
        int numero;

        System.out.println("\nIntroduce un número entero: ");
        numero = miEscaner.nextInt();

        System.out.println("\nEl numero introducido es: " + numero);

        if (numero % 2 == 0)
            System.out.println("\nEl número es par\n");
        else
            System.out.println("\nEl número es impar\n");

        if (numero == 0)
            System.out.println("\nEl número es el cero\n");
        else
            System.out.println("\nEl número es distinto de cero\n");

        if (numero > 100)
            System.out.println("\nEl número es elevado\n");
        else
            System.out.println("\nEl número es bajo\n");

        miEscaner.close();

    }

}
