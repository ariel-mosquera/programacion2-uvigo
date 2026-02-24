package ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        Articulo a = new Articulo("Memoria USB 64 GB", 10, TipoIVA.GENERAL);
        System.out.println(a);

        Articulo b = new Articulo("Memoria USB 32 GB", 10, TipoIVA.REDUCIDO);
        System.out.println(b);

        Articulo c = new Articulo("Memoria USB 16 GB", 10, TipoIVA.SUPERREDUCIDO);
        System.out.println(c);

        Articulo d = new Articulo("Memoria USB 8 GB", 10, TipoIVA.EXENTO);
        System.out.println(d);
    }
}
