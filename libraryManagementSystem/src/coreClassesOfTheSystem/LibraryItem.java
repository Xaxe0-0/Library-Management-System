package coreClassesOfTheSystem;

// Abstract class for all library items (books, magazines, etc.)
public abstract class LibraryItem {

     private String title; // title of the book
    private Genre genre; // genre of the book

        // Constructor to create a library item
    public LibraryItem(String title, Genre genre) {
        this.title = title;
        this.genre = genre;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

     // Getter for genre
    public Genre getGenre() {
        return genre;
    }

         // Abstract method to display item info (must be implemented by subclasses)
    public abstract void displayInfo();

}
