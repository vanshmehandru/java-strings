import java.util.Scanner;

public class AdvancedStringAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== ADVANCED STRING ANALYZER ===");

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        performAllComparisons(str1, str2);

        double similarity = calculateSimilarity(str1, str2);
        System.out.printf("Similarity Percentage: %.2f%%\n", similarity);

        analyzeMemoryUsage(str1, str2);

        String[] inputs = {str1, str2, "Extra", "Strings", "For", "Test"};
        String result = optimizedStringProcessing(inputs);
        System.out.println("Optimized concatenation: " + result);

        demonstrateStringIntern();

        scanner.close();
    }

    public static double calculateSimilarity(String str1, String str2) {
        int distance = levenshteinDistance(str1, str2);
        int maxLen = Math.max(str1.length(), str2.length());
        if (maxLen == 0) return 100.0;
        return 100.0 * (maxLen - distance) / maxLen;
    }

    private static int levenshteinDistance(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i <= s1.length(); i++) dp[i][0] = i;
        for (int j = 0; j <= s2.length(); j++) dp[0][j] = j;
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
                else
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1],
                                    Math.min(dp[i - 1][j], dp[i][j - 1]));
            }
        }
        return dp[s1.length()][s2.length()];
    }

    public static void performAllComparisons(String str1, String str2) {
        System.out.println("\n--- String Comparison Analysis ---");
        System.out.println("Reference equality (==): " + (str1 == str2));
        System.out.println("Content equality (equals): " + str1.equals(str2));
        System.out.println("Case-insensitive equality (equalsIgnoreCase): " + str1.equalsIgnoreCase(str2));
        System.out.println("Lexicographic comparison (compareTo): " + str1.compareTo(str2));
        System.out.println("Case-insensitive lexicographic comparison: " + str1.compareToIgnoreCase(str2));
    }

    public static void analyzeMemoryUsage(String... strings) {
        System.out.println("\n--- String Memory Usage Analysis ---");
        for (String s : strings) {
            int size = 40 + 2 * s.length(); // 40 bytes object overhead, 2 bytes per char
            System.out.println("String: \"" + s + "\" | Approx. memory: " + size + " bytes");
        }
    }

    public static String optimizedStringProcessing(String[] inputs) {
        StringBuilder sb = new StringBuilder();
        for (String s : inputs) {
            sb.append(s).append(" ");
        }
        return sb.toString().trim();
    }

    public static void demonstrateStringIntern() {
        System.out.println("\n--- String Intern Demonstration ---");
        String a = new String("hello");
        String b = new String("hello");
        System.out.println("a == b: " + (a == b));
        String aIntern = a.intern();
        String bIntern = b.intern();
        System.out.println("a.intern() == b.intern(): " + (aIntern == bIntern));
        System.out.println("a == \"hello\": " + (a == "hello"));
        System.out.println("a.intern() == \"hello\": " + (aIntern == "hello"));
    }
}