public class Book {

    private String genre;
    private String author;
    private int countOfPages;
    private boolean isFinished;

    public Book(String genre, String author, int countOfPages, boolean isFinished) {
        this.genre = genre;
        this.author = author;
        this.countOfPages = countOfPages;
        this.isFinished = isFinished;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public void setCountOfPages(int countOfPages) {
        this.countOfPages = countOfPages;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    @Override
    public String toString() {
        return "Book{" +
                "genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                ", countOfPages=" + countOfPages +
                ", isFinished=" + isFinished +
                '}';
    }
}
