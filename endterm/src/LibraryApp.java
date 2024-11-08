import java.util.Scanner;

public class LibraryApp {
    private static Database db = Database.getInstance();

    public static void main(String[] args) {
        // Initialize with some books and users
        initializeLibrary();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Library Management System!");

        while (true) {
            System.out.println("\nEnter 1 to borrow a book, 2 to return a book, 3 to exit:");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    borrowBook(scanner);
                    break;
                case 2:
                    returnBook(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the system.");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void borrowBook(Scanner scanner) {
        System.out.print("Enter the book title: ");
        String title = scanner.nextLine();
        Book book = db.getBook(title);

        if (book != null) {
            System.out.println("You have borrowed the book: " + title);
        } else {
            System.out.println("Book not found.");
        }
    }

    private static void returnBook(Scanner scanner) {
        System.out.print("Enter the book title: ");
        String title = scanner.nextLine();
        Book book = db.getBook(title);

        if (book != null) {
            System.out.println("You have returned the book: " + title);
        } else {
            System.out.println("Book not found.");
        }
    }

    private static void initializeLibrary() {
        Database db = Database.getInstance();

        db.addBook(new Book.BookBuilder()
                .setTitle("Java Programming")
                .setAuthor("John Doe")
                .setPages(300)
                .build());

        db.addBook(new Book.BookBuilder()
                .setTitle("Design Patterns")
                .setAuthor("Erich Gamma")
                .setPages(395)
                .build());

        db.addBook(new Book.BookBuilder()
                .setTitle("Clean Code")
                .setAuthor("Robert C. Martin")
                .setPages(464)
                .build());

        db.addBook(new Book.BookBuilder()
                .setTitle("Effective Java")
                .setAuthor("Joshua Bloch")
                .setPages(412)
                .build());

        db.addBook(new Book.BookBuilder()
                .setTitle("The Pragmatic Programmer")
                .setAuthor("Andrew Hunt and David Thomas")
                .setPages(352)
                .build());

        db.addBook(new Book.BookBuilder()
                .setTitle("Introduction to Algorithms")
                .setAuthor("Thomas H. Cormen")
                .setPages(1312)
                .build());

        db.addBook(new Book.BookBuilder()
                .setTitle("Artificial Intelligence: A Modern Approach")
                .setAuthor("Stuart Russell and Peter Norvig")
                .setPages(1152)
                .build());

        db.addBook(new Book.BookBuilder()
                .setTitle("Refactoring: Improving the Design of Existing Code")
                .setAuthor("Martin Fowler")
                .setPages(448)
                .build());

        db.addBook(new Book.BookBuilder()
                .setTitle("Head First Design Patterns")
                .setAuthor("Eric Freeman and Elisabeth Robson")
                .setPages(694)
                .build());

        db.addBook(new Book.BookBuilder()
                .setTitle("You Don't Know JS")
                .setAuthor("Kyle Simpson")
                .setPages(278)
                .build());

        System.out.println("Library initialized with sample books.");
    }

}
