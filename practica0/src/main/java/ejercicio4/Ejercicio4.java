package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String [] args){
        var teclado = new Scanner(System.in);

        System.out.print("Introduce operador (+,-,*,/): ");
        var operador = teclado.nextLine().charAt(0);

        System.out.println("\nPrimer real: ");
        var num1 = teclado.nextDouble();

        System.out.println("\nSegundo real: ");
        var num2 = teclado.nextDouble();

        var resultado = switch ( operador ) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '/' -> {
                if (num2 == 0) {
                    yield Double.NaN;
                }
                else {
                    yield num1 / num2;
                }
            }
            default -> 0;
        };

        System.out.println("\nEl resultado es: " + resultado);

        teclado.close();
    }
}
