package ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        var num1 = 5;
        var num2 = 2;

        System.out.println("Suma de " + num1 + " y " + num2 + " es: " + suma(num1, num2));
        
        System.out.println("Resta de " + num1 + " y " + num2 + " es: " + resta(num1, num2));

        System.out.println("Producto de " + num1 + " y " + num2 + " es: " + producto(num1, num2));
        
        System.out.println("División de  " + num1 + " y " + num2 + " es: " + division(num1, num2));
    }

    public static int suma(int n1, int n2) {
        return n1 + n2;
    }

    public static int resta(int n1, int n2) {
        return n1 - n2;
    }

    public static int producto(int n1, int n2) {
        return n1 * n2;
    }

    public static double division(int n1, int n2) {

        if (n2 == 0) {
            System.out.println("\nNo se puede dividir por cero!\n");
            return Double.NaN;
        }
        else
        {
            return (double) n1 / n2;
        }
    }

}
