import java.util.HashMap;

public final class Drink extends MenuItem implements Alcoholable{
    private double alcoholVol;
    private DrinkTypeEnum type;
    private static HashMap<DrinkTypeEnum, Integer> priceTable = new HashMap<>();

    public Drink(int price, String name, String description) {
        super(price, name, description);
    }

    public Drink(String name, String description) {
        super(name, description);
        type = DrinkTypeEnum.valueOf(name);
        if(priceTable.isEmpty()) fillPriceTable();
        else price = priceTable.get(type);
    }

    public void fillPriceTable(){
        priceTable.put(DrinkTypeEnum.WHISKEY, 120);
        priceTable.put(DrinkTypeEnum.BLACK_TEA, 40);
        priceTable.put(DrinkTypeEnum.COFFE, 70);
        priceTable.put(DrinkTypeEnum.GREEN_TEA, 42);
        priceTable.put(DrinkTypeEnum.JUICE, 60);
        priceTable.put(DrinkTypeEnum.MILK, 45);
        priceTable.put(DrinkTypeEnum.SODA, 60);
        priceTable.put(DrinkTypeEnum.BEER, 85);
        priceTable.put(DrinkTypeEnum.WATER, 20);
        priceTable.put(DrinkTypeEnum.BRANDY, 140);
        priceTable.put(DrinkTypeEnum.CHAMPAGNE, 150);
        priceTable.put(DrinkTypeEnum.JAGERMEISTER, 200);
        priceTable.put(DrinkTypeEnum.LIQUOR, 140);
        priceTable.put(DrinkTypeEnum.WINE, 150);
        priceTable.put(DrinkTypeEnum.RUM, 145);
        priceTable.put(DrinkTypeEnum.TEQUILA, 123);
        priceTable.put(DrinkTypeEnum.VERMUTH, 110);
        priceTable.put(DrinkTypeEnum.VODKA, 97);
    }
    public DrinkTypeEnum getType() {
        return type;
    }

    @Override
    public boolean isAlcoholicDrink() {
        if(type == DrinkTypeEnum.BLACK_TEA || type == DrinkTypeEnum.GREEN_TEA || type == DrinkTypeEnum.COFFE ||
        type == DrinkTypeEnum.MILK || type == DrinkTypeEnum.WATER || type == DrinkTypeEnum.SODA || type == DrinkTypeEnum.JUICE) return false;
        else return true;
    }

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }
}
