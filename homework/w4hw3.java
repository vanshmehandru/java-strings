package week4.homework;
import java.util.*;

class Book {
    String title;
    String author;
    String isbn;
    boolean isAvailable;

    Book() {
        this.title = "";
        this.author = "";
        this.isbn = "";
        this.isAvailable = true;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isbn = "";
        this.isAvailable = true;
    }

    Book(String title, String author, String isbn, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }

    void borrowBook() {
        if (isAvailable) isAvailable = false;
    }

    void returnBook() {
        isAvailable = true;
    }

    void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Available: " + isAvailable);
        System.out.println("------------------");
    }
}

public class w4hw3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter title: ");
        String title = sc.nextLine();

        System.out.print("Enter author: ");
        String author = sc.nextLine();

        System.out.print("Enter ISBN: ");
        String isbn = sc.nextLine();

        Book b1 = new Book();
        Book b2 = new Book(title, author);
        Book b3 = new Book(title, author, isbn, true);

        b2.borrowBook();
        b3.borrowBook();
        b3.returnBook();

        b1.displayBookInfo();
        b2.displayBookInfo();
        b3.displayBookInfo();

        sc.close();
    }
}

