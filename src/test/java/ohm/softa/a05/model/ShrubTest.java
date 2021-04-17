package ohm.softa.a05.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShrubTest {

    @Test
    void getColor() {
        var shrub = new Shrub(1, "family", "name");
        assertEquals(PlantColor.GREEN, shrub.getColor());
    }
}
