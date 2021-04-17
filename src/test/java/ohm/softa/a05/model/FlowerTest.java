package ohm.softa.a05.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FlowerTest {

    @Test
    void illegalColor() {
        assertThrows(IllegalArgumentException.class,
                () -> new Flower(1, "family", "name", PlantColor.GREEN));
    }

    @Test
    void getColor() {
        var flower = new Flower(1, "family", "name", PlantColor.BLUE);
        assertEquals(PlantColor.BLUE, flower.getColor());
    }
}
