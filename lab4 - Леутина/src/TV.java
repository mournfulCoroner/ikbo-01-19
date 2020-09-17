public class TV implements Priceable{
    private int amountOfChannels;
    private double price;

    public TV(int amountOfChannels, double price) {
        this.amountOfChannels = amountOfChannels;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
