public class DatabaseAdapter implements ModernDatabase {
    private LegacyDatabase legacyDatabase;

    public DatabaseAdapter(LegacyDatabase legacyDatabase) {
        this.legacyDatabase = legacyDatabase;
    }

    public void addBook(String title) {
        legacyDatabase.insertBook(title);
    }
}
