import java.util.Scanner;

public class ASCIIProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int ascii = (int) ch;
            System.out.print("Character: '" + ch + "' | ASCII: " + ascii);

            String type = classifyCharacter(ch);
            System.out.print(" | Type: " + type);

            if (type.equals("Uppercase Letter") || type.equals("Lowercase Letter")) {
                char upper = Character.toUpperCase(ch);
                char lower = Character.toLowerCase(ch);
                System.out.print(" | Upper: '" + upper + "' (" + (int) upper + ")");
                System.out.print(" | Lower: '" + lower + "' (" + (int) lower + ")");
                System.out.print(" | ASCII diff: " + Math.abs((int) upper - (int) lower));
            }
            System.out.println();
        }

        System.out.print("\nEnter shift for Caesar cipher: ");
        int shift = scanner.nextInt();
        scanner.nextLine();
        String ciphered = caesarCipher(input, shift);
        System.out.println("Caesar cipher result: " + ciphered);

        System.out.print("ASCII Art: ");
        int[] asciiArr = stringToASCII(input);
        for (int code : asciiArr) {
            System.out.print(code + " ");
        }
        System.out.println();

        System.out.println("\nASCII Table (32-126):");
        displayASCIITable(32, 126);

        scanner.close();
    }

    public static String classifyCharacter(char ch) {
        if (Character.isUpperCase(ch)) return "Uppercase Letter";
        if (Character.isLowerCase(ch)) return "Lowercase Letter";
        if (Character.isDigit(ch)) return "Digit";
        return "Special Character";
    }

    public static char toggleCase(char ch) {
        if (Character.isUpperCase(ch)) {
            return (char) (ch + 32);
        } else if (Character.isLowerCase(ch)) {
            return (char) (ch - 32);
        }
        return ch;
    }

    public static String caesarCipher(String text, int shift) {
        StringBuilder sb = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                sb.append((char) ('A' + (ch - 'A' + shift + 26) % 26));
            } else if (Character.isLowerCase(ch)) {
                sb.append((char) ('a' + (ch - 'a' + shift + 26) % 26));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void displayASCIITable(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.printf("%3d: %c   ", i, (char) i);
            if ((i - start + 1) % 8 == 0) System.out.println();
        }
        System.out.println();
    }

    public static int[] stringToASCII(String text) {
        int[] arr = new int[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = (int) text.charAt(i);
        }
        return arr;
    }

    public static String asciiToString(int[] asciiValues) {
        StringBuilder sb = new StringBuilder();
        for (int val : asciiValues) {
            sb.append((char) val);
        }
        return sb.toString();
    }
}