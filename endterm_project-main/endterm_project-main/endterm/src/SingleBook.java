public class SingleBook implements LibraryItem {
    private String title;

    public SingleBook(String title) {
        this.title = title;
    }

    public void display() {
        System.out.println("Book: " + title);
    }
}
