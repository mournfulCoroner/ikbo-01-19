public final class Drink extends MenuItem implements Alcoholable{
    private double alcoholVol;
    private DrinkTypeEnum type;

    public Drink(int price, String name, String description) {
        super(price, name, description);
    }

    public Drink(String name, String description) {
        super(name, description);
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
