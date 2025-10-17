class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;
        Book b = (Book) obj;
        return title.equals(b.title) && author.equals(b.author);
    }
}

public class CompareBooks {
    public static void main(String[] args) {
        Book book1 = new Book("OOP in Java", "Herbert");
        Book book2 = new Book("OOP in Java", "Herbert");
        Book book3 = book1;

        System.out.println(book1 == book2);
        System.out.println(book1.equals(book2));
        System.out.println(book1 == book3);
    }
}
