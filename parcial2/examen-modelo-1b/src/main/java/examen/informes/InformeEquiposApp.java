package examen.informes;

import examen.base.Equipo;
import examen.base.DesarrolladorSenior;
import examen.base.DesarrolladorJunior;

import java.io.File;
import java.util.List;

public class InformeEquiposApp {

    public static void main(String[] args) throws Exception {
        Equipo equipoBackend = new Equipo("Backend");
        Equipo equipoFrontend = new Equipo("Frontend");

        // TODO: añadir desarrolladores cuando implementes las subclases de Desarrollador:
        // equipoBackend.añadirDesarrollador(new DesarrolladorSenior(...));
        // equipoBackend.añadirDesarrollador(new DesarrolladorJunior(...));
        // equipoFrontend.añadirDesarrollador(new DesarrolladorSenior(...));

        InformeEquipos informe = new InformeEquipos(
                List.of(equipoBackend, equipoFrontend));
        File fichero = new File("informe.txt");

        // 1. Escribir informe a consola (fichero = null):
        informe.generarInforme(null);

        // 2. Escribir informe al fichero:
        informe.generarInforme(fichero);

        // TODO ejercicio 3: sustituir las dos llamadas anteriores por otras dos
        // donde se pase una instancia de una implementación de la interfaz Salida.
    }
}
