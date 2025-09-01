import java.util.*;

class Compression {
    static char[] chars;
    static int[] freq;
    static String[][] map;

    static void countFreq(String text) {
        chars = new char[text.length()];
        freq = new int[text.length()];
        int k = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int pos = -1;
            for (int j = 0; j < k; j++) if (chars[j] == c) pos = j;
            if (pos == -1) {
                chars[k] = c;
                freq[k] = 1;
                k++;
            } else freq[pos]++;
        }
        chars = Arrays.copyOf(chars, k);
        freq = Arrays.copyOf(freq, k);
    }

    static void buildMap() {
        map = new String[chars.length][2];
        for (int i = 0; i < chars.length; i++) {
            map[i][0] = String.valueOf(chars[i]);
            map[i][1] = Integer.toString(i, 36);
        }
    }

    static String compress(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            for (String[] m : map) if (m[0].charAt(0) == c) sb.append(m[1]);
        }
        return sb.toString();
    }

    static String decompress(String comp) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < comp.length(); i++) {
            String code = String.valueOf(comp.charAt(i));
            for (String[] m : map) if (m[1].equals(code)) sb.append(m[0]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        countFreq(text);
        buildMap();
        String comp = compress(text);
        String decomp = decompress(comp);
        System.out.println("Original: " + text);
        System.out.println("Compressed: " + comp);
        System.out.println("Decompressed: " + decomp);
    }
}
