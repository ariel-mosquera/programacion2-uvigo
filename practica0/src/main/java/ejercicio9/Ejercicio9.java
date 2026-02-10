package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        var teclado = new Scanner(System.in);
        String temp;
        int arr[] = new int[10];
        int max;
        int min;
        double promedio;

        System.out.println("A continuación introduzca " + arr.length + " números enteros");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("\nIndice (" + i + ")");
            System.out.print("Número: ");
            temp = teclado.nextLine();
            arr[i] = Integer.parseInt(temp);
        }

        max = buscarMax(arr);
        min = buscarMin(arr);
        promedio = calcularMedia(arr);

        System.out.println("\nEl máx. del array es " + max);
        System.out.println("El mín. del array es " + min);
        System.out.println("La media del array es " + promedio);

        teclado.close(); // porque debo cerrar la variable de tipo Scanner?
    }

    public static int buscarMax(int arr[]) {
        var mayor = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (mayor < arr[i])
                mayor = arr[i];
        }

        return mayor;
    }

    public static int buscarMin(int arr[]) {
        var menor = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (menor > arr[i])
                menor = arr[i];
        }

        return menor;
    }

    public static double calcularMedia(int arr[]) {
        var suma = 0;

        for (int i = 0; i < arr.length; i++) 
            suma += arr[i];

        System.out.println("La suma de los elementos es: " + suma);

        return (double) suma / arr.length;
    }
}
