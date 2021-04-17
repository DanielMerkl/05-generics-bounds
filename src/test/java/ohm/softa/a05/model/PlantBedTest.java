package ohm.softa.a05.model;

import ohm.softa.a05.collections.SimpleList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlantBedTest {
    private PlantBed<Flower> plantBed;

    @BeforeEach
    void setUp() {
        plantBed = new PlantBed<>();

        plantBed.add(new Flower(1, "family", "name", PlantColor.ORANGE));
        plantBed.add(new Flower(1, "family", "name", PlantColor.ORANGE));
        plantBed.add(new Flower(1, "family", "name", PlantColor.ORANGE));
        plantBed.add(new Flower(1, "family", "name", PlantColor.BLUE));
        plantBed.add(new Flower(1, "family", "name", PlantColor.BLUE));
    }

    @Test
    void add() {
        plantBed.add(new Flower(1, "family", "name", PlantColor.BLUE));

        assertEquals(6, plantBed.size());
    }

    @Test
    void size() {
        assertEquals(5, plantBed.size());
    }

    @Test
    void getPlantsByColor() {
        var orangeFlowers = plantBed.getPlantsByColor(PlantColor.ORANGE);
        var blueFlowers = plantBed.getPlantsByColor(PlantColor.BLUE);

        assertEquals(3, orangeFlowers.size());
        assertEquals(2, blueFlowers.size());
    }
}
