package ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        Punto p1 = new Punto(3, 4);
        Punto p2 = new Punto(0, 0);
        Punto p3 = new Punto(12, -5);
        Punto p4 = new Punto(1.5, 2.5);

        System.out.println("Punto 1: " + p1);
        System.out.println("Distancia al origen: " + p1.distanciaOrigen());
        
        System.out.println("Punto 2: " + p2);
        System.out.println("Distancia al origen: " + p2.distanciaOrigen());

        System.out.println("Punto 3: " + p3);
        System.out.println("Distancia al origen: " + p3.distanciaOrigen());

        System.out.println("Punto 4: " + p4);
        System.out.println("Distancia al origen: " + p4.distanciaOrigen());

    }
}
