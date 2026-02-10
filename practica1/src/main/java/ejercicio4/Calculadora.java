package ejercicio4;

public class Calculadora {
    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static int sumar(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static double multiply(int num1, double num2) {
        return num1 * num2;
    }

    public static double discount(double price, double percentage) {
        return (double) price * (1 - percentage / 100);
    }

    public static double discount(double price, float fixDiscount) {
        return (double) price - fixDiscount;
    }

    public static double discount(double price, double percentage, double minValue) {
        if (price * (1 - percentage) > minValue)
            return price * (1 - percentage);
        else { 
            System.out.println("Minimum value achieved");
            return 0
        }
    }

}
