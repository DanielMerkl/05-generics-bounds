package ohm.softa.a05.utils;

import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.model.Flower;
import ohm.softa.a05.model.PlantBed;
import ohm.softa.a05.model.PlantColor;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PlantBedUtilityTest {

    @Test
    void splitBedByColor() {
        var plantBed = new PlantBed<Flower>();

        plantBed.add(new Flower(1, "family", "name", PlantColor.YELLOW));
        plantBed.add(new Flower(1, "family", "name", PlantColor.RED));
        plantBed.add(new Flower(1, "family", "name", PlantColor.RED));
        plantBed.add(new Flower(1, "family", "name", PlantColor.BLUE));
        plantBed.add(new Flower(1, "family", "name", PlantColor.BLUE));
        plantBed.add(new Flower(1, "family", "name", PlantColor.BLUE));
        plantBed.add(new Flower(1, "family", "name", PlantColor.ORANGE));
        plantBed.add(new Flower(1, "family", "name", PlantColor.ORANGE));
        plantBed.add(new Flower(1, "family", "name", PlantColor.ORANGE));
        plantBed.add(new Flower(1, "family", "name", PlantColor.ORANGE));

        var map = PlantBedUtility.splitBedByColor(plantBed);

        assertEquals(1, map.get(PlantColor.YELLOW).size());
        assertEquals(2, map.get(PlantColor.RED).size());
        assertEquals(3, map.get(PlantColor.BLUE).size());
        assertEquals(4, map.get(PlantColor.ORANGE).size());
    }
}
