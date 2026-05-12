package examen.informes;

import examen.base.Equipo;

import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.List;

public class InformeEquipos {

    private List<Equipo> equipos;

    public InformeEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    // TODO ejercicio 3: cambiar la cabecera de este método para que reciba
    // una instancia de Salida en lugar de un File, convirtiéndolo en:
    //     generarInforme(Salida salida) throws IOException
    // Adaptar el interior eliminando el if-else: usa el objeto salida para
    // escribir de forma polimórfica.
    public void generarInforme(File fichero) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (Equipo e : equipos) {
            sb.append("Equipo: ").append(e.getNombre()).append("\n");
            for (int i = 0; i < e.getNumDesarrolladores(); i++) {
                sb.append("  ").append(e.getDesarrollador(i)).append("\n");
            }
            sb.append("  Total horas: ").append(e.getTotalHoras()).append("\n");
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
