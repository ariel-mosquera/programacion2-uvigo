package ejercicio2;

public class OperacionSalir implements Operacion {

    @Override
    public String getDescripcion() {
        return "Salir";
    }

    @Override
    public void ejecutar() {
        System.out.println("¡Hasta luego!");
    }

}
