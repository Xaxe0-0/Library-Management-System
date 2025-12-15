# Library-Management-System
This project is a simple Java console-based Library Management System. It allows users to interact with a virtual library through a menu-driven interface where they can register books, view available books, search by genre, and manage basic library operations. The program is designed to demonstrate basic object-oriented programming (OOP) concepts in Java, such as classes, objects, encapsulation, enums, and user input handling.

The main purpose of this project is to:

Practice Java fundamentals

Apply OOP principles in a real-world scenario

Demonstrate how multiple classes interact in a system

Create a beginner-friendly library system using the console

How the System Works

The program starts in the App class (main entry point).

A menu is displayed to the user using the console.

The user selects options by entering numbers.

Classes Used
1. App

Contains the main() method

Handles user input using Scanner

Controls program flow and menu navigation

2. Library

Manages the collection of books

Contains methods for registering and displaying books

Acts as the main controller of library operations

3. Book

Represents a book object

Stores book details such as title, author, and genre

4. Genre (Enum)

Defines constant book categories such as:

TECHNOLOGY

HISTORY

FICTION

SCIENCE

The system performs actions such as registering books, displaying books, and filtering books by genre.

The program continues running until the user chooses to exit.

Methods Used 

main(String[] args) – Starts the program

registerBook(Book book) – Adds a new book to the library

displayBooks() – Shows all registered books

displayBooksByGenre() – Displays books grouped by genre

Scanner.nextInt() / Scanner.nextLine() – Reads user input

Notes

This system does not use a database. All data is stored temporarily in memory while the program is running.

Sample Program Output

Library Management System
1. Display all books
2. Borrow a book
3. Return a book
4. Display books by genre
5. Exit
Choose an option: 1
Library Books:
Book: Java Basics | Author: Alexandrie Abon | Genre: TECHNOLOGY | Borrowed: false
Book: World History | Author: Rob Sison | Genre: HISTORY | Borrowed: false
Book: Fictional Story | Author: Sam Sales | Genre: FICTION | Borrowed: false
Book: Flat Earth Theory | Author: Wally Bayola | Genre: SCIENCE | Borrowed: false

Library Management System
1. Display all books
2. Borrow a book
3. Return a book
4. Display books by genre
5. Exit
Choose an option: 2
Enter book title to borrow: World History
World History has been borrowed.

Library Management System
1. Display all books
2. Borrow a book
3. Return a book
4. Display books by genre
5. Exit
Choose an option: 3
Enter book title to return: World History
World History has been returned.

Library Management System
1. Display all books
2. Borrow a book
3. Return a book
4. Display books by genre
5. Exit
Choose an option: 4
Genre: FICTION
 - Fictional Story
Genre: NONFICTION
Genre: SCIENCE
 - Flat Earth Theory
Genre: HISTORY
 - World History
Genre: TECHNOLOGY
 - Java Basics

Library Management System
1. Display all books
2. Borrow a book
3. Return a book
4. Display books by genre
5. Exit
Choose an option: 5
Exiting system...
