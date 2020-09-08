public class Plate extends Dish {
    private double radius;
    private String material;
    private boolean integrity;

    public Plate(boolean breakability, int temperatureResistance, double price, double radius, String material, boolean integrity) {
        this.radius = radius;
        this.material = material;
        this.integrity = integrity;
        this.breakability = breakability;
        this.price = price;
        this.temperatureResistance = temperatureResistance;
    }

    public void crash() {
        if(isBreakability() && integrity)
        {
            integrity = false;
            price = 0;
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isIntegrity() {
        return integrity;
    }

    public void setIntegrity(boolean integrity) {
        this.integrity = integrity;
    }

    @Override
    public String toString() {
        return "Dish: plate{" +
                "radius=" + radius +
                ", material='" + material + '\'' +
                ", integrity=" + integrity +
                ", breakability=" + breakability +
                ", temperatureResistance=" + temperatureResistance +
                ", price=" + price +
                '}';
    }
}
