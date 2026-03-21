package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        var teclado = new Scanner(System.in);
        String temp;
        var opt = 's';

        do {
            System.out.print("Introduce operador (+,-,*,/): ");
            var operador = teclado.nextLine().charAt(0);

            System.out.println("\nPrimer real: ");
            temp = teclado.nextLine();
            var num1 = Double.parseDouble(temp);

            System.out.println("\nSegundo real: ");
            temp = teclado.nextLine();
            var num2 = Double.parseDouble(temp);

            var resultado = switch (operador) {
                case '+' -> num1 + num2;
                case '-' -> num1 - num2;
                case '/' -> {
                    if (num2 == 0)
                        yield Double.NaN;
                    else
                        yield num1 / num2;
                }
                default -> 0;
            };

            System.out.println("\nEl resultado es: " + resultado);

            do {
                System.out.println("\n Desea seguir? (s) o (n): ");
                opt = teclado.nextLine().charAt(0);

                if (opt != 's' && opt != 'S' && opt != 'N' && opt != 'n')
                    System.out.println("\nValor inválido\n");

            } while (opt != 's' && opt != 'S' && opt != 'N' && opt != 'n');

        } while (opt == 's' || opt == 'S');

        teclado.close();
    }
}
