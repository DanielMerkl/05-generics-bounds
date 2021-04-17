package ohm.softa.a05.model;

public abstract class Plant implements Comparable<Plant> {
    private final double height;
    private final String family;
    private final String name;

    public Plant(double height, String family, String name) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be grater than 0.");
        }
        if (family == null || family.isBlank()) {
            throw new IllegalArgumentException("No family specified");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("No name specified.");
        }
        this.height = height;
        this.family = family;
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public abstract PlantColor getColor();

    @Override
    public int compareTo(Plant other) {
        return Double.compare(this.height, other.height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Plant plant = (Plant) o;

        if (Double.compare(plant.height, height) != 0) return false;
        if (family != null ? !family.equals(plant.family) : plant.family != null) return false;
        return name != null ? name.equals(plant.name) : plant.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(height);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (family != null ? family.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Plant{" +
               "height=" + height +
               ", family='" + family + '\'' +
               ", name='" + name + '\'' +
               ", color='" + getColor() + '\'' +
               '}';
    }
}
