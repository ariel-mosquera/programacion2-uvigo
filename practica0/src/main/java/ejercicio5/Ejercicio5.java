package ejercicio5;

import java.util.Scanner; 

public class Ejercicio5 {
    public static void main (String [] args) {

        Scanner miScanner = new Scanner(System.in);
        int num;
        int suma = 0;

        do {
            System.out.println("\nEscribe un número entero mayor que cero");
            num = miScanner.nextInt();

            if (num <= 0)
                System.out.println("\nNúmero inválido\n");

        } while (num <= 0);

        for (int i = 0; i <= num; i++) {
                suma += i * 2;
        }

        System.out.println("\nLa suma de los " + num + " primeros números pares es " + suma + "\n");

        miScanner.close();
    }
}
