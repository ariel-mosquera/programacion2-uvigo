package ejercicio2;

import ejercicio1.Hour;
import ejercicio1.Date;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio2Test {
    Hour hour = new Hour(15, 30);
    Date date = new Date(13, 04, 2026);
    Employee participant = new Employee("Ariel", "ejemplo@outlook.com");
    Employee secretary = new Employee("Mosquera", "secretary@outlook.com");
    Reunion reunion;

    @BeforeEach
    void createReunionObject() {
        reunion = new Reunion("1", "room 7", hour, date, secretary, participant);
    }

    @Test
    void constructorTest() {
        assertEquals("1", reunion.getMeetingTopic());
        assertEquals("room 7", reunion.getPlace());
        assertSame(hour, reunion.getHour());
        assertSame(date, reunion.getDate());
        assertSame(secretary, reunion.getParticipantByPosition(0));
        assertSame(participant, reunion.getParticipantByPosition(1));
    }

    @Test
    void illegalRemoveSecretaryTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            reunion.removeByPosition(0);
        });
    }

    @Test
    void illegalSetSecretaryTest() {
        assertThrows(IllegalArgumentException.class, () -> {
            reunion.setSecretary(new Employee("Non participant", "nonparticipant@outlook.com"));
        });
    }
}
