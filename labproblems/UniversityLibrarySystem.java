package week7.labproblems;

class LibraryUser {
    protected String name;

    public LibraryUser(String name) {
        this.name = name;
    }

    public void enterLibrary() {
        System.out.println(name + " entered the library.");
    }

    public void displayInfo() {
        System.out.println("Library User: " + name);
    }
}

class Student extends LibraryUser {
    public Student(String name) {
        super(name);
    }

    public void borrowBook() {
        System.out.println(name + " borrowed a book.");
    }

    public void accessComputer() {
        System.out.println(name + " is using a computer.");
    }
}

class Faculty extends LibraryUser {
    public Faculty(String name) {
        super(name);
    }

    public void reserveBook() {
        System.out.println(name + " reserved a book.");
    }

    public void accessResearchDatabase() {
        System.out.println(name + " is accessing research databases.");
    }
}

class Guest extends LibraryUser {
    public Guest(String name) {
        super(name);
    }

    public void browseBooks() {
        System.out.println(name + " is browsing through books.");
    }
}

public class UniversityLibrarySystem {
    public static void main(String[] args) {
        LibraryUser user1 = new Student("Alice");   // upcast
        LibraryUser user2 = new Faculty("Dr. Smith"); // upcast
        LibraryUser user3 = new Guest("Bob");       // upcast

        user1.enterLibrary();
        user2.enterLibrary();
        user3.enterLibrary();

        user1.displayInfo();
        user2.displayInfo();
        user3.displayInfo();

        // Downcasting if specific features are needed
        if (user1 instanceof Student) {
            ((Student) user1).borrowBook();
            ((Student) user1).accessComputer();
        }

        if (user2 instanceof Faculty) {
            ((Faculty) user2).reserveBook();
            ((Faculty) user2).accessResearchDatabase();
        }

        if (user3 instanceof Guest) {
            ((Guest) user3).browseBooks();
        }
    }
}

