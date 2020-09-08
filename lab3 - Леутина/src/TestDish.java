public class TestDish {
    public static void main(String[] args)
    {
        Fork myFork = new Fork(false, 5, 16.3,
                10, 6);
        Plate myPlate = new Plate(true, 2,
                45, 8, "Glass", true);
        System.out.println(myFork);
        System.out.println(myPlate);
        myFork.breakADenticle();
        myFork.breakADenticle();
        myPlate.crash();
        System.out.println(myFork);
        System.out.println(myPlate);
    }
}
