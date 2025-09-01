package practise;
import java.util.*;
public class TextProcessor {

    public static String cleanInput(String input) {
        input = input.trim().replaceAll("\\s+", " ");
        String[] words = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0)))
              .append(word.substring(1).toLowerCase())
              .append(" ");
        }
        return sb.toString().trim();
    }

    public static void analyzeText(String text) {
        String[] words = text.split("\\s+");
        int wordCount = words.length;
        int charCount = text.replace(" ", "").length();
        int sentenceCount = text.split("[.!?]").length;

        String longestWord = "";
        for (String word : words) {
            String cleanWord = word.replaceAll("[^a-zA-Z]", "");
            if (cleanWord.length() > longestWord.length()) {
                longestWord = cleanWord;
            }
        }
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : text.replaceAll("\\s+", "").toLowerCase().toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        char mostCommonChar = ' ';
        int maxFreq = 0;
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxFreq) {
                mostCommonChar = entry.getKey();
                maxFreq = entry.getValue();
            }
        }

        System.out.println("\n--- Text Analysis ---");
        System.out.println("Words: " + wordCount);
        System.out.println("Sentences: " + sentenceCount);
        System.out.println("Characters (no spaces): " + charCount);
        System.out.println("Longest word: " + longestWord);
        System.out.println("Most common character: '" + mostCommonChar + "'");
    }

    public static String[] getWordsSorted(String text) {
        String[] words = text.replaceAll("[^a-zA-Z\\s]", "").split("\\s+");
        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);
        return words;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== TEXT PROCESSOR ===");
        System.out.print("Enter a paragraph: ");
        String paragraph = scanner.nextLine();

        String cleaned = cleanInput(paragraph);
        analyzeText(cleaned);

        String[] sortedWords = getWordsSorted(cleaned);
        System.out.println("\n--- Words in Alphabetical Order ---");
        for (String word : sortedWords) {
            System.out.println(word);
        }

        System.out.print("\nEnter a word to search: ");
        String searchWord = scanner.nextLine();
        boolean found = Arrays.stream(sortedWords)
                              .anyMatch(w -> w.equalsIgnoreCase(searchWord));
        System.out.println(found ? "Word found!" : "Word not found.");

        scanner.close();
    }
}
