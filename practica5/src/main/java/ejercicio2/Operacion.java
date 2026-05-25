package ejercicio2;

// Aqui usamos inteerface porque las clases no comparten el estado

public interface Operacion {

    /**
     * @return una descripción
     */
    public String getDescripcion();

    public void ejecutar();
}
