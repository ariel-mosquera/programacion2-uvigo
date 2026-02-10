package ejercicio4;

public class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double multiply(int num1, double num2) {
        return num1 * num2;
    }

    public double discount(double price, double percentage) {
        return (double) price * (1 - percentage / 100);
    }

    public double discount(double price, int fixDiscount) {
        return (double) price - fixDiscount;
    }

    public double discount(double price, double percentage, double minValue) {
        if (price * (1 - percentage) > minValue)
            return price * (1 - percentage);
        else { 
            System.out.println("Minimum value achieved");
            return minValue;
        }
    }

}
