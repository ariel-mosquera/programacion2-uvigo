package ejercicio1;

import java.util.Scanner;

public class Division {

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        String linea;
        Scanner scan = new Scanner(System.in);
        boolean valido = true;

        do {
            try {

                System.out.print("\nIntroduzca dividendo: ");
                linea = scan.nextLine();
                num1 = Integer.parseInt(linea);

                System.out.print("\nIntroduzca divisor: ");
                linea = scan.nextLine();
                num2 = Integer.parseInt(linea);

                valido = true;

            } catch (NumberFormatException e) {
                System.out.println("Lo que introduciste no fue un entero, vuelve a intentar...");
                valido = false;
            }
        } while (!valido);

        try {
            System.out.println("\nEl resultado es: " + divide(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("La división por " + num2 + " no está definida");
        }

        scan.close();
    }
}