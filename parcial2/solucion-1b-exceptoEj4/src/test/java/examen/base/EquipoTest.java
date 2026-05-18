package examen.base;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests a escribir por el alumno:
//
// Ejercicio 2:
//   - Test que compruebe que se puede crear un Equipo, añadirle desarrolladores
//     de distintos tipos y que el número de desarrolladores es correcto.
//   - Test que compruebe que getTotalHoras() devuelve la suma correcta de las
//     horas máximas de todos los desarrolladores del equipo.
//
// Ejercicio 4:
//   - Test llamado testGetTotalHorasSoloDesarrolladorJunior que compruebe que
//     getTotalHoras(Predicate<Desarrollador>) devuelve la suma correcta de horas
//     cuando se filtra solo por los desarrolladores que son DesarrolladorJunior.

public class EquipoTest {

    @Test
    void testGetNombre() {
        Equipo e = new Equipo("Backend");
        assertEquals("Backend", e.getNombre());
    }

    @Test
    void testGetNumeroDeDesarrolladores() {
        Equipo e = new Equipo("Backend");
        e.anadirDesarrollador(new DesarrolladorJunior("Ariel", "test@outlook.com", true));
        e.anadirDesarrollador(new DesarrolladorJunior("Mosquera", "ejemplo@gmail.com", false));
        e.anadirDesarrollador(new DesarrolladorSenior("Pepe", "test2@outlook.com", true));
        e.anadirDesarrollador(new DesarrolladorSenior("Ribeiro", "ejemplo2@outlook.com", false));
        int valorEsperado = 4;

        assertEquals(valorEsperado, e.getNumDesarrolladores());
    }

    @Test
    void testGetTotalHoras() {
        Equipo e = new Equipo("Backend");
        e.anadirDesarrollador(new DesarrolladorJunior("Ariel", "test@outlook.com", true));
        e.anadirDesarrollador(new DesarrolladorJunior("Mosquera", "ejemplo@gmail.com", false));
        e.anadirDesarrollador(new DesarrolladorSenior("Pepe", "test2@outlook.com", true));
        e.anadirDesarrollador(new DesarrolladorSenior("Ribeiro", "ejemplo2@outlook.com", false));
        int valorEsperado = 3650;

        assertEquals(valorEsperado, e.getTotalHoras());
    }

}
