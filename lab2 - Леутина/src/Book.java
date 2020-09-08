public class Book {
    private String author;
    private String title;
    private int year;
    private String genre;
    private int amountOfPages;

    public Book(String author, String title, int year, String genre, int amountOfPages) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.amountOfPages = amountOfPages;
    }
    public Book(){}

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", amountOfPages=" + amountOfPages +
                '}';
    }
}
