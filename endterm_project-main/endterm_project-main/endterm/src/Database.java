import java.util.HashMap;
import java.util.Map;

public class Database {
    private static Database instance;
    private Map<String, Book> books;
    private Map<String, User> users;

    private Database() {
        books = new HashMap<>();
        users = new HashMap<>();
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }

    public Book getBook(String title) {
        return books.get(title);
    }

    public void addUser(String userId, User user) {
        users.put(userId, user);
    }

    public User getUser(String userId) {
        return users.get(userId);
    }
}
