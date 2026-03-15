package ejercicio1;

import java.util.Scanner;

public class Division {

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        int num1;
        int num2;
        String linea;
        Scanner scan = new Scanner(System.in);

        System.out.print("\nIntroduzca dividendo: ");
        linea = scan.nextLine();
        num1 = Integer.parseInt(linea);

        System.out.print("\nIntroduzca divisor: ");
        linea = scan.nextLine();
        num2 = Integer.parseInt(linea);

        System.out.println("\nEl resultado es: " + divide(num1, num2));

        scan.close();
    }
}
