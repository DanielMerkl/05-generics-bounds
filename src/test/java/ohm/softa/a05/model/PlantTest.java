package ohm.softa.a05.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class PlantTest {
    private static class PlantTestImpl extends Plant {
        public PlantTestImpl(double height, String family, String name) {
            super(height, family, name);
        }

        @Override
        public PlantColor getColor() {
            return null;
        }
    }

    @Test
    void illegalHeight() {
        assertThrows(IllegalArgumentException.class,
                () -> new PlantTestImpl(-1, "family", "name"));
    }

    @Test
    void illegalFamily() {
        assertThrows(IllegalArgumentException.class,
                () -> new PlantTestImpl(1, null, "name"));
        assertThrows(IllegalArgumentException.class,
                () -> new PlantTestImpl(1, "", "name"));
        assertThrows(IllegalArgumentException.class,
                () -> new PlantTestImpl(1, " ", "name"));
    }

    @Test
    void illegalName() {
        assertThrows(IllegalArgumentException.class,
                () -> new PlantTestImpl(1, "family", null));
        assertThrows(IllegalArgumentException.class,
                () -> new PlantTestImpl(1, "family", ""));
        assertThrows(IllegalArgumentException.class,
                () -> new PlantTestImpl(1, "family", " "));
    }
}
