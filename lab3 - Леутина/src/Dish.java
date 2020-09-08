public abstract class Dish {
    protected boolean breakability;
    protected int temperatureResistance;
    protected double price;

    public boolean isBreakability() {
        return breakability;
    }

    public void setBreakability(boolean breakability) {
        this.breakability = breakability;
    }

    public int getTemperatureResistance() {
        return temperatureResistance;
    }

    public void setTemperatureResistance(int temperatureResistance) {
        this.temperatureResistance = temperatureResistance;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
