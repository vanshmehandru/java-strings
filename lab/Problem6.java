import java.util.*;

public class Problem6 {
    static List<String> splitWords(String text) {
        List<String> words = new ArrayList<>();
        int start = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                if (i > start) words.add(text.substring(start, i));
                start = i + 1;
            }
        }
        if (start < text.length()) words.add(text.substring(start));
        return words;
    }
    static List<String> justify(List<String> words, int width) {
        List<String> lines = new ArrayList<>();
        int i = 0;
        while (i < words.size()) {
            int len = words.get(i).length(), j = i + 1;
            while (j < words.size() && len + 1 + words.get(j).length() <= width) {
                len += 1 + words.get(j).length();
                j++;
            }
            StringBuilder line = new StringBuilder();
            int gaps = j - i - 1;
            if (j == words.size() || gaps == 0) {
                for (int k = i; k < j; k++) {
                    if (k > i) line.append(" ");
                    line.append(words.get(k));
                }
                while (line.length() < width) line.append(" ");
            } else {
                int spaces = (width - len) / gaps;
                int extra = (width - len) % gaps;
                for (int k = i; k < j; k++) {
                    line.append(words.get(k));
                    if (k < j - 1) {
                        for (int s = 0; s <= spaces; s++) line.append(" ");
                        if (extra-- > 0) line.append(" ");
                    }
                }
            }
            lines.add(line.toString());
            i = j;
        }
        return lines;
    }
    static List<String> center(List<String> words, int width) {
        List<String> lines = new ArrayList<>();
        StringBuilder line = new StringBuilder();
        for (String w : words) {
            if (line.length() + w.length() + 1 > width) {
                int pad = (width - line.length()) / 2;
                StringBuilder c = new StringBuilder();
                for (int i = 0; i < pad; i++) c.append(" ");
                c.append(line);
                lines.add(c.toString());
                line = new StringBuilder();
            }
            if (line.length() > 0) line.append(" ");
            line.append(w);
        }
        if (line.length() > 0) lines.add(line.toString());
        return lines;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int width = sc.nextInt();
        List<String> words = splitWords(text);
        List<String> j = justify(words, width);
        List<String> c = center(words, width);
        System.out.println("Justified:");
        for (String l : j) System.out.println(l);
        System.out.println("Centered:");
        for (String l : c) System.out.println(l);
    }
}
