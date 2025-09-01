package homework;
import java.util.*;

public class PalindromeCheck {

    // Logic 1: Iterative method
    static boolean isPalindromeIterative(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method
    static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true; 
        if (text.charAt(start) != text.charAt(end)) return false; 
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Reverse using char array
    static boolean isPalindromeArray(String text) {
        char[] original = text.toCharArray();
        char[] reverse = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            reverse[i] = text.charAt(text.length() - 1 - i);
        }
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("\nChecking Palindrome with 3 logics:");
        System.out.println("Logic 1 (Iterative): " + (isPalindromeIterative(text) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 2 (Recursive): " + (isPalindromeRecursive(text, 0, text.length() - 1) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 3 (Char Array): " + (isPalindromeArray(text) ? "Palindrome" : "Not Palindrome"));
    }
}
