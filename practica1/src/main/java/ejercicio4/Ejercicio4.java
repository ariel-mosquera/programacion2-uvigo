package ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("1 + 2 = " + calc.add(1, 2));
        System.out.println("1 + 3 + 5 = " + calc.add(1, 3, 5));
        System.out.println("2 * 3 = " + calc.multiply(2, 3));
        System.out.println("2 * 5.2 = " + calc.multiply(2, 5.2));
        System.out.println("Precio: 20.00€, con descuento del 25% = " + calc.discount(20, 25.00));
        System.out.println();
    }
}