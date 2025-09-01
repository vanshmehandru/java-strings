import java.util.*;

public class Problem2 {
    static char toUpper(char c) {
        if (c >= 'a' && c <= 'z') return (char)(c - 32);
        return c;
    }
    static char toLower(char c) {
        if (c >= 'A' && c <= 'Z') return (char)(c + 32);
        return c;
    }
    static String toUpperCaseManual(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) sb.append(toUpper(s.charAt(i)));
        return sb.toString();
    }
    static String toLowerCaseManual(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) sb.append(toLower(s.charAt(i)));
        return sb.toString();
    }
    static String toTitleCaseManual(String s) {
        StringBuilder sb = new StringBuilder();
        boolean start = true;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                sb.append(c);
                start = true;
            } else {
                if (start) sb.append(toUpper(c));
                else sb.append(toLower(c));
                start = false;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String u = toUpperCaseManual(s);
        String l = toLowerCaseManual(s);
        String t = toTitleCaseManual(s);
        System.out.println("Manual Upper: " + u + " Built-in: " + s.toUpperCase());
        System.out.println("Manual Lower: " + l + " Built-in: " + s.toLowerCase());
        System.out.println("Manual Title: " + t);
    }
}

