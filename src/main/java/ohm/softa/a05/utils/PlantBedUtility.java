package ohm.softa.a05.utils;

import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.model.Plant;
import ohm.softa.a05.model.PlantBed;
import ohm.softa.a05.model.PlantColor;

import java.util.HashMap;
import java.util.Map;

public abstract class PlantBedUtility {
    private PlantBedUtility() {
    }

    public static <T extends Plant> Map<PlantColor, SimpleList<T>> splitBedByColor(PlantBed<T> plantBed) {
        var result = new HashMap<PlantColor, SimpleList<T>>();

        for (PlantColor plantColor : PlantColor.values()) {
            result.put(plantColor, plantBed.getPlantsByColor(plantColor));
        }

        return result;
    }
}
