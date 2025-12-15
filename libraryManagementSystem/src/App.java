import java.util.Scanner;
import coreClassesOfTheSystem.*;
public class App {
    public static void main(String[] args) throws Exception {
    
         Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        // Pre-register some books
        library.registerBook(new Book("Java Basics", "Alexandrie Abon", Genre.TECHNOLOGY));
        library.registerBook(new Book("World History", "Rob Sison", Genre.HISTORY));
        library.registerBook(new Book("Fictional Story", "Sam Sales", Genre.FICTION));
        library.registerBook(new Book("Flat Earth Theory", "Wally Bayola", Genre.SCIENCE ));

        boolean exit = false;

        while (!exit) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Display all books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Display books by genre");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // reads newline

            switch (choice) {
                case 1:
                    library.displayAllBooks();
                    break;
                case 2:
                    System.out.print("Enter book title to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    library.borrowBook(borrowTitle);
                    break;
                case 3:
                    System.out.print("Enter book title to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 4:
                    library.displayBooksByGenre();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
    }
