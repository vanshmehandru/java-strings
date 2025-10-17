import java.util.*;

class BookItem implements Cloneable {
    String title;

    BookItem(String title) {
        this.title = title;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class LibrarySystem implements Cloneable {
    List<BookItem> books = new ArrayList<>();

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    LibrarySystem deepClone() throws CloneNotSupportedException {
        LibrarySystem lib = (LibrarySystem) super.clone();
        lib.books = new ArrayList<>();
        for (BookItem b : books)
            lib.books.add((BookItem) b.clone());
        return lib;
    }
}

public class LibraryClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        LibrarySystem lib1 = new LibrarySystem();
        lib1.books.add(new BookItem("Java"));
        lib1.books.add(new BookItem("C++"));

        LibrarySystem shallow = (LibrarySystem) lib1.clone();
        LibrarySystem deep = lib1.deepClone();

        lib1.books.get(0).title = "Python";

        System.out.println("Original: " + lib1.books.get(0).title);
        System.out.println("Shallow: " + shallow.books.get(0).title);
        System.out.println("Deep: " + deep.books.get(0).title);
    }
}
