public class UserFactory {
    public static User createUser(String type) {
        switch (type) {
            case "Librarian":
                return new Librarian();
            case "Patron":
                return new Patron();
            default:
                throw new IllegalArgumentException("Unknown user type.");
        }
    }
}
