public class Test {
    //Реализовать интерфейс Priceable, имеющий метод getPrice(),
    //возвращающий некоторую цену для объекта. Проверить работу для
    //различных классов, сущности которых могут иметь цену.
    public static void main(String[] args) {
        Carrot cr = new Carrot("not so orange", 12.3);
        TV firstTV = new TV(34, 1200);
        System.out.println(cr.getPrice());
        System.out.println(firstTV.getPrice());
    }
}
