package ejercicio3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio3Test {

    Carriage carriage1 = new Carriage("A Coruña", null, null);
    Carriage carriage2 = new Carriage("Lugo", null, null);
    Carriage carriage3 = new Carriage("Ourense", null, null);
    Carriage carriage4 = new Carriage("Pontevedra", null, null);
    Train train = new Train(5000, carriage1);

    @BeforeEach
    void setUp() {
        carriage4.setNext(carriage3);
        carriage3.setNext(carriage2);
        carriage2.setNext(carriage1);
    }

    @Test
    void correctCarriagesInstantiationTest() {

        Carriage[] array = { carriage1, carriage2, carriage3, carriage4 };

        Carriage current = carriage1;

        for (int i = 0; i < array.length; i++) {
            assertEquals(current, array[i]);
            current = current.getPrevious();
        }
    }

    @Test
    void getNumOfCarriagesTest() {
        assertEquals(4, train.getNumOfCarriages());
    }
}
