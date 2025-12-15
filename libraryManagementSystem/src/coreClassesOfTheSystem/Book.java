package coreClassesOfTheSystem;


// Book class inherits from LibraryItem
public class Book extends LibraryItem {

     private String author;
    private boolean isBorrowed;

    // Constructor 1 Set title, author, genre
    public Book(String title, String author, Genre genre) {

        // Call parent constructor
        super(title, genre); 
        this.author = author;
        
        // Initially not borrowed
        this.isBorrowed = false; 
    }

    // Constructor 2 (Overloading) Set title and genre only
    public Book(String title, Genre genre) {
        super(title, genre);
        this.author = "Unknown";
        this.isBorrowed = false;
    }

    // Encapsulation-Check if the book is borrowed
    public boolean isBorrowed() {
        return isBorrowed;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

        // Borrow the book
    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println(getTitle() + " has been borrowed.");
        } else {
            System.out.println(getTitle() + " is already borrowed.");
        }
    }

    // Return the book
    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println(getTitle() + " has been returned.");
        } else {
            System.out.println(getTitle() + " was not borrowed.");
        }
    }

    // Polymorphism Display book information (override from LibraryItem)
    @Override
    public void displayInfo() {
        System.out.println("Book: " + getTitle() + " | Author: " + author + " | Genre: " + getGenre() + " | Borrowed: " + isBorrowed);
    }
}
