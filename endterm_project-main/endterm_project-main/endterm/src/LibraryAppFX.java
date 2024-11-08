import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LibraryAppFX extends Application {
    private static Database db = Database.getInstance();

    public static void main(String[] args) {
        initializeLibrary();
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Library Management System");

        Label titleLabel = new Label("Library Management System");

        // Input for book title
        TextField bookTitleInput = new TextField();
        bookTitleInput.setPromptText("Enter book title");

        // Borrow button
        Button borrowButton = new Button("Borrow Book");
        Label borrowStatus = new Label();
        borrowButton.setOnAction(e -> {
            String title = bookTitleInput.getText();
            Book book = db.getBook(title);
            if (book != null) {
                borrowStatus.setText("You borrowed: " + title);
            } else {
                borrowStatus.setText("Book not found.");
            }
        });

        // Return button
        Button returnButton = new Button("Return Book");
        Label returnStatus = new Label();
        returnButton.setOnAction(e -> {
            String title = bookTitleInput.getText();
            Book book = db.getBook(title);
            if (book != null) {
                returnStatus.setText("You returned: " + title);
            } else {
                returnStatus.setText("Book not found.");
            }
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(titleLabel, bookTitleInput, borrowButton, borrowStatus, returnButton, returnStatus);

        Scene scene = new Scene(layout, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
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

