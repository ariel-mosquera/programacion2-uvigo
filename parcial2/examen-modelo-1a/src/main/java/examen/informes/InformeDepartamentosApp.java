package examen.informes;

import examen.base.Departamento;
import examen.base.ProfesorTitular;
import examen.base.ProfesorAyudante;

import java.io.File;
import java.util.List;

public class InformeDepartamentosApp {

    public static void main(String[] args) throws Exception {
        Departamento departamentoInformatica = new Departamento("Informática");
        Departamento departamentoDerecho = new Departamento("Derecho");

        // TODO: añadir profesores cuando implementes las subclases de Profesor:
        // departamentoInformatica.añadirProfesor(new ProfesorTitular(...));
        // departamentoInformatica.añadirProfesor(new ProfesorAyudante(...));
        // departamentoDerecho.añadirProfesor(new ProfesorTitular(...));

        InformeDepartamentos informe = new InformeDepartamentos(
                List.of(departamentoInformatica, departamentoDerecho));
        File fichero = new File("informe.txt");

        // 1. Escribir informe a consola (fichero = null):
        informe.generarInforme(null);

        // 2. Escribir informe al fichero:
        informe.generarInforme(fichero);

        // TODO ejercicio 3: sustituir las dos llamadas anteriores por otras dos
        // donde se pase una instancia de una implementación de la interfaz Salida.
    }
}
