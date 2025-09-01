package practise;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter your favorite programming language: ");
        String favLang = scanner.nextLine();

        System.out.print("Write a sentence about your programming experience: ");
        String sentence = scanner.nextLine();

        String[] nameParts = fullName.trim().split("\\s+");
        String firstName = nameParts[0];
        String lastName = nameParts.length > 1 ? nameParts[1] : "";
        int charCount = sentence.replace(" ", "").length();
        String favLangUpper = favLang.toUpperCase();
        System.out.println("\n--- Summary ---");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Favorite Language (Uppercase): " + favLangUpper);
        System.out.println("Characters in your sentence (no spaces): " + charCount);

        scanner.close();
    }
}
