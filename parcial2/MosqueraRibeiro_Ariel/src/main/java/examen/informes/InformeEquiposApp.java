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

        equipoBackend.anadirDesarrollador(new DesarrolladorSenior("Ariel", "ejemplo@outlook.com", true));
        equipoBackend.anadirDesarrollador(new DesarrolladorJunior("Mosquera", "test@gmail.com", false));
        equipoFrontend.anadirDesarrollador(new DesarrolladorSenior("Ribeiro", "prueba@outlook.com", true));

        InformeEquipos informe = new InformeEquipos(
                List.of(equipoBackend, equipoFrontend));
        File fichero = new File("informe.txt");

        // 1. Escribir informe a consola (fichero = null):
        informe.generarInforme(new SalidaConsola());

        // 2. Escribir informe al fichero:
        informe.generarInforme(new SalidaFichero(fichero));
    }
}
