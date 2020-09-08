public class Fork extends Dish{
    private int levelOfSharpness;
    private int amountOfDenticles;

    public Fork(boolean breakability, int temperatureResistance, double price, int levelOfSharpness, int amountOfDenticles) {
        this.levelOfSharpness = levelOfSharpness;
        this.amountOfDenticles = amountOfDenticles;
        this.breakability = breakability;
        this.price = price;
        this.temperatureResistance = temperatureResistance;
    }

    public void breakADenticle() {
        if(amountOfDenticles > 0)
        {
            amountOfDenticles--;
            price /= 2;
        }
    }
    public int getLevelOfSharpness() {
        return levelOfSharpness;
    }

    public void setLevelOfSharpness(int levelOfSharpness) {
        this.levelOfSharpness = levelOfSharpness;
    }

    public int getAmountOfDenticles() {
        return amountOfDenticles;
    }

    public void setAmountOfDenticles(int amountOfDenticles) {
        this.amountOfDenticles = amountOfDenticles;
    }

    @Override
    public String toString() {
        return "Dish: fork{" +
                "levelOfSharpness=" + levelOfSharpness +
                ", amountOfDenticles=" + amountOfDenticles +
                ", breakability=" + breakability +
                ", temperatureResistance=" + temperatureResistance +
                ", price=" + price +
                '}';
    }
}
