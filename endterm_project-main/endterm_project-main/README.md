Library Management System Documentation
1. Project Concept & Design (20%)
1.1 Project Overview
The Library Management System is designed to facilitate book borrowing and returning processes within a library setting. It provides a simple interface for users (librarians and patrons) to interact with the library catalog and manage book transactions. The system is designed using Software Design Patterns to improve maintainability, flexibility, and scalability.

1.2 Problem-Solving Approach
This project addresses the common requirements of library systems: managing a collection of books, tracking users, and handling book borrowing and returning. The system demonstrates a practical use case for managing a library, leveraging common design patterns to provide a robust solution.

1.3 Design Thought Process
The system’s design leverages several key design patterns and adheres to SOLID principles to ensure modularity, maintainability, and extensibility. Each component, such as User, Book, and Database, is designed with a specific purpose and is implemented to be as reusable as possible.

2. Use of SOLID Principles (15%)
The project adheres to the SOLID principles as follows:

Single Responsibility Principle: Each class in the system has a single responsibility. For example, the User class hierarchy defines various user roles, and the Database class handles data storage.
Open/Closed Principle: Classes like Book and User are open for extension but closed for modification, ensuring changes do not affect existing functionality.
Liskov Substitution Principle: The User interface is implemented by Librarian and Patron, ensuring any User-type object can be used interchangeably without breaking the system.
Interface Segregation Principle: Small, focused interfaces (e.g., ModernDatabase, LibraryItem) allow for flexibility in implementing specific functions without adding unnecessary methods.
Dependency Inversion Principle: The project depends on abstractions, like User and Command, rather than concrete implementations, allowing easier updates and testing.
3. Application of Creational Patterns (15%)
3.1 Singleton Pattern
The Singleton pattern is used for the Database class to ensure only one instance of the database exists. This helps manage the library’s data in a centralized manner.

3.2 Factory Pattern
The Factory pattern is applied in UserFactory to instantiate different types of users (e.g., Librarian, Patron). This pattern allows easy addition of new user types in the future.

3.3 Builder Pattern
The Builder pattern is used in the Book class to simplify the creation of complex Book objects with multiple properties like title, author, and pages. This also makes the code more readable when adding books to the database.

4. Application of Structural Patterns (15%)
4.1 Adapter Pattern
The Adapter pattern is used in DatabaseAdapter to adapt an existing LegacyDatabase to work with the system’s ModernDatabase interface. This pattern allows seamless integration of legacy code without modifying it.

4.2 Composite Pattern
The Composite pattern is used for grouping LibraryItem objects. A Section object can contain multiple LibraryItem objects, making it easy to manage and display hierarchical structures, like sections in a library.

4.3 Decorator Pattern
The Decorator pattern is implemented in the GenreDecorator class to extend the functionality of BookInfo by adding genre descriptions to basic book objects.

5. Application of Behavioral Patterns (15%)
5.1 Strategy Pattern
The Strategy pattern is implemented for different search algorithms in the library, allowing for multiple search strategies, such as TitleSearch and AuthorSearch. This makes it easy to add new search strategies in the future.

5.2 Observer Pattern
The Observer pattern is applied to notify users when a book becomes available. For example, the BookAvailabilityNotifier class notifies all registered patrons (observers) when a book’s status changes.

5.3 Command Pattern
The Command pattern is used to encapsulate book borrowing and returning actions. BorrowBookCommand and ReturnBookCommand represent user actions, improving the modularity and flexibility of the code.

6. Team Collaboration & Git Workflow (10%)
6.1 Version Control
The project was developed collaboratively using Git for version control. Each team member worked on specific modules, committing changes and creating pull requests regularly. Git branches were used to separate features and prevent conflicts.

6.2 Team Coordination
Tasks were distributed to each team member based on their strengths, ensuring an efficient workflow. Code reviews were conducted for each pull request to maintain code quality, and issues were tracked in Git to resolve any bugs or enhancements.

7. Code Quality & Documentation (10%)
7.1 Code Clarity
The code is organized, with meaningful variable names and functions. Each function is kept concise to handle only one task, improving readability and maintainability.

7.2 Documentation
All classes and methods are documented with Javadoc comments to describe their purpose and usage. This helps new contributors understand the code quickly.

7.3 Readability
Naming conventions follow Java standards, and consistent indentation is maintained throughout the code. This consistency improves the readability of the code.

8. User Interaction (Graphical User Interface)
The system includes both command-line and GUI interfaces:

Command-line Interface: Users can borrow and return books through a console-based interface in LibraryApp.
JavaFX GUI Interface: The JavaFX interface in LibraryAppFX provides a user-friendly GUI where users can enter book titles, and click on buttons to borrow or return books. This interface includes text fields for user input and status labels for visual feedback.
8.1 JavaFX GUI
The JavaFX-based GUI offers a more intuitive experience, allowing users to:

Enter book titles in a text field.
Borrow and return books using interactive buttons.
Receive status updates on book transactions.


Conclusion
The Library Management System demonstrates effective use of Software Design Patterns and SOLID principles to create a maintainable, modular, and user-friendly system. The system’s structure allows for easy future expansion and improvements, making it well-suited for library operations.
