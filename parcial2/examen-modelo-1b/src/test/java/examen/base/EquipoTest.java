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
    public void testGetNombre() {
        Equipo e = new Equipo("Backend");
        assertEquals("Backend", e.getNombre());
    }

}
