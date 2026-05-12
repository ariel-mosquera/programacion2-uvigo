package examen.informes;

import examen.base.Equipo;

import java.io.IOException;
import java.util.List;

public class InformeEquipos {

    private List<Equipo> equipos;

    public InformeEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public void generarInforme(Salida salida) throws IOException {
        StringBuilder sb = new StringBuilder();

        for (Equipo e : equipos) {
            sb.append("Equipo: ").append(e.getNombre()).append("\n");

            for (int i = 0; i < e.getNumDesarrolladores(); i++) {
                sb.append("  ").append(e.getDesarrollador(i)).append("\n");
            }

            sb.append("  Total horas: ").append(e.getTotalHoras()).append("\n");
        }

        salida.escribir(sb.toString());
    }
}
