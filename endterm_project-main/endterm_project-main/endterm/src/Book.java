public class Book {
    private String title;
    private String author;
    private int pages;

    private Book(BookBuilder builder) {
        this.title = builder.title;
        this.author = builder.author;
        this.pages = builder.pages;
    }

    // Getter method for the title
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public static class BookBuilder {
        private String title;
        private String author;
        private int pages;

        public BookBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public BookBuilder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder setPages(int pages) {
            this.pages = pages;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
