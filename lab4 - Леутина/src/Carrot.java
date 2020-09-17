public class Carrot implements Priceable {

    private String color;
    private double price;

    public Carrot(String color, double price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public double getPrice(){
        return price;
    }
}
