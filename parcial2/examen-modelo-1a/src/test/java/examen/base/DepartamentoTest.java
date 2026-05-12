package examen.base;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Tests a escribir por el alumno:
//
// Ejercicio 2:
//   - Test que compruebe que se puede crear un Departamento, añadirle profesores
//     de distintos tipos y que el número de profesores es correcto.
//   - Test que compruebe que getTotalHoras() devuelve la suma correcta de las
//     horas máximas de todos los profesores del departamento.
//
// Ejercicio 4:
//   - Test llamado testGetTotalHorasSoloProfesorAyudante que compruebe que
//     getTotalHoras(Predicate<Profesor>) devuelve la suma correcta de horas
//     cuando se filtra solo por los profesores que son ProfesorAyudante.

public class DepartamentoTest {

    @Test
    public void testGetNombre() {
        Departamento d = new Departamento("Informática");
        assertEquals("Informática", d.getNombre());
    }

}
