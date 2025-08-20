import java.util.*;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence with mixed formatting: ");
        String input = scanner.nextLine();
        String trimmed = input.trim();
        System.out.println("Trimmed: " + trimmed);

        String replacedSpaces = trimmed.replace(' ', '_');
        System.out.println("Spaces replaced with underscores: " + replacedSpaces);

        String noDigits = trimmed.replaceAll("\\d", "");
        System.out.println("Removed digits: " + noDigits);

        String[] words = trimmed.split("\\s+");
        System.out.println("Words array: " + Arrays.toString(words));

        String joined = String.join(" | ", words);
        System.out.println("Joined with '|': " + joined);

        String noPunct = removePunctuation(trimmed);
        System.out.println("No punctuation: " + noPunct);

        String capitalized = capitalizeWords(trimmed);
        System.out.println("Capitalized words: " + capitalized);

        String reversed = reverseWordOrder(trimmed);
        System.out.println("Reversed word order: " + reversed);

        System.out.println("Word frequency:");
        countWordFrequency(trimmed);

        scanner.close();
    }

    public static String removePunctuation(String text) {
        return text.replaceAll("\\p{Punct}", "");
    }

    public static String capitalizeWords(String text) {
        String[] words = text.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                sb.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) {
                    sb.append(word.substring(1).toLowerCase());
                }
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static String reverseWordOrder(String text) {
        String[] words = text.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) sb.append(" ");
        }
        return sb.toString();
    }

    public static void countWordFrequency(String text) {
        String[] words = text.trim().toLowerCase().split("\\s+");
        Map<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            word = word.replaceAll("\\p{Punct}", "");
            if (word.isEmpty()) continue;
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}