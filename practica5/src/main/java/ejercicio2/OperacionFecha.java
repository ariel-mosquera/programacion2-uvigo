package ejercicio2;

public class OperacionFecha implements Operacion {

    public String getDescripcion() {
        return "¿Qué día es hoy?";
    }

    public void ejecutar() {
        System.out.println("Hoy es: " + java.time.LocalDate.now());
    }

}
