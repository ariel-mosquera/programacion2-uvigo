package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class UsandoLambdas {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        List<String> losDeTamanoMayorA3 = new ArrayList<>();
        AtomicInteger longitudTotal = new AtomicInteger(0);
        int[] longitudTotalArr = { 0 };
        Consumer<String> calcularTam = s -> System.out.println(s.length());
        Consumer<String> refImprimir = UsandoLambdas::imprimir;

        lista.add("uno");
        lista.add("dos");
        lista.add("tres");

        lista.forEach(s -> System.out.println(s));

        lista.forEach(s -> {
            if (s.length() > 3)
                losDeTamanoMayorA3.add(s);

            // Utilizando AtomicInteger
            longitudTotal.set(longitudTotal.get() + s.length());

            // Utilizando array de una posición
            longitudTotalArr[0] += s.length();
        });

        System.out.println("Longitud Total (Utilizando AtomicInteger): " + longitudTotal.get());
        System.out.println("Longitud Total (Utilizando un array de entero): " + longitudTotalArr[0]);

        lista.forEach(calcularTam);

        lista.forEach(refImprimir);

    }

    static void imprimir(String texto) {
        System.out.println(texto);
    }
}
