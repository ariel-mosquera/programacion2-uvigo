package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        var teclado = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int num;
        var fila = -1;
        var columna = -1;
        var encontrado = false;

        System.out.println("Introduce los números para la matriz");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println("Posición [" + i + "][" + j + "]");
                System.out.print("Número: ");
                matrix[i][j] = Integer.parseInt(teclado.nextLine());
            }
        }

        System.out.print("Introduce el número a buscar: ");
        num = Integer.parseInt(teclado.nextLine());

        for (int i = 0; i < matrix.length && !encontrado; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == num) {
                    encontrado = true;
                    fila = i;
                    columna = j;
                }
            }
        }

        if (encontrado)
            System.out.println("El elemento está en la fila " + fila + ", columna " + columna);
        else
            System.out.println("Elemento no encontrado");

        teclado.close();
    }
}