public class GenreDecorator implements BookInfo {
    private BookInfo book;

    public GenreDecorator(BookInfo book) {
        this.book = book;
    }

    public String getDescription() {
        return book.getDescription() + " It includes genre information.";
    }
}
