package ejercicio1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio1Test {

    @Test
    void ReunionConstructorTest() {
        Reunion reunion = new Reunion("1", "Sala 2", 7, 4, 2026, 9, 15);

        assertEquals("1", reunion.getMeetingTopic());
        assertEquals("Sala 2", reunion.getPlace());
        assertEquals(7, reunion.getDate().getDay());
        assertEquals(4, reunion.getDate().getMonth());
        assertEquals(2026, reunion.getDate().getYear());
        assertEquals(9, reunion.getHour().getHour());
        assertEquals(15, reunion.getHour().getMinuts());
    }
}
