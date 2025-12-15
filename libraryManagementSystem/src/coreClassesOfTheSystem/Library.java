package coreClassesOfTheSystem;
import Tool.Registerable;

// Library class that can store and manage books
public class Library implements Registerable {

    private Book[] books = new Book[100]; // Array to store books (max 100)
    private int bookCount = 0; // Number of books currently in the library

        // Register a new book in the library
    @Override
    public boolean registerBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book; // Add book and increment count
            System.out.println(book.getTitle() + " registered successfully.");
            return true;
        } else {
            System.out.println("Library is full."); // Library cannot hold more books
            return false;
        }
    }

     // Display all books in the library
    public void displayAllBooks() {
        System.out.println("Library Books:");
        for (Book book : books) { // For-each loop
            if (book != null) {
                book.displayInfo(); // Call the book's display method
            }
        }
    }

    // Borrow a book by title
    public void borrowBook(String title) {
        for (Book book : books) {
            if (book != null && book.getTitle().equalsIgnoreCase(title)) {
                book.borrowBook(); // Borrow if found
                return;
            }
        }
        System.out.println("Book not found."); // If book does not exist
    }

    // Return a book by title
    public void returnBook(String title) {
        for (Book book : books) {
            if (book != null && book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook(); // Return if found
                return;
            }
        }
        System.out.println("Book not found."); // If book does not exist
    }

         // Display books organized by genre
    public void displayBooksByGenre() {
        Genre[] genres = Genre.values(); // Get all possible genres
        Book[][] booksByGenre = new Book[genres.length][books.length]; // 2D array

        // Nested for loop to sort books into genres
        for (int i = 0; i < genres.length; i++) {
            int index = 0;
            for (int j = 0; j < bookCount; j++) {
                if (books[j].getGenre() == genres[i]) {
                    booksByGenre[i][index++] = books[j]; // Add book to genre list
                }
            }
        }

        // Nested for-each loop to display books by genre
        for (int i = 0; i < genres.length; i++) {
            System.out.println("Genre: " + genres[i]);
            for (Book b : booksByGenre[i]) {
                if (b != null) {
                    System.out.println(" - " + b.getTitle());
                }
            }
        }
    }

}
