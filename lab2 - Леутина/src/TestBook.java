public class TestBook {

    public static void main(String[] args)
    {
        Book myBook = new Book("James Lee", "House in The Night", 1856, "fantasy",
                125);
        System.out.println(myBook);
        myBook.setAmountOfPages(345);
        myBook.setTitle("House in The Day");
        System.out.println(myBook);
    }
}
