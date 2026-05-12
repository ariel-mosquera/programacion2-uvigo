package examen.informes;

import examen.base.Departamento;

import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.List;

public class InformeDepartamentos {

    private List<Departamento> departamentos;

    public InformeDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    // TODO ejercicio 3: cambiar la cabecera de este método para que reciba
    // una instancia de Salida en lugar de un File, convirtiéndolo en:
    //     generarInforme(Salida salida) throws IOException
    // Adaptar el interior eliminando el if-else: usa el objeto salida para
    // escribir de forma polimórfica.
    public void generarInforme(File fichero) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (Departamento d : departamentos) {
            sb.append("Departamento: ").append(d.getNombre()).append("\n");
            for (int i = 0; i < d.getNumProfesores(); i++) {
                sb.append("  ").append(d.getProfesor(i)).append("\n");
            }
            sb.append("  Total horas: ").append(d.getTotalHoras()).append("\n");
        }

        // if-else problemático que debemos quitar
        if (fichero == null) {
            System.out.println(sb.toString());
        } else {
            PrintWriter pw = new PrintWriter(fichero);
            pw.println(sb.toString());
            pw.close();
        }
    }
}
