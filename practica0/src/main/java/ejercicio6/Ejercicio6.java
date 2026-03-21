package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main (String [] args) {
        var miEscanner = new Scanner(System.in);
        int num;

        System.out.println("\nIntroduzca un número: ");
        num = miEscanner.nextInt();

        if (esPrimo(num))
            System.out.println("\nEl número es primo\n");
        else
            System.out.println("\nEl número no es primo\n");
        
        miEscanner.close();
    }
    
    public static boolean esPrimo(int num) {
        var i = 2;
        boolean esValido = true;
        var raiz = (int) Math.sqrt(num);
    
        while (esValido && i <= raiz) {
    
            if (num % i == 0) {
                esValido = false;
            }
    
            i++;
        }
    
        return esValido;
    }
}

