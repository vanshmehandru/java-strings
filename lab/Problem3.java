import java.util.*;

public class Problem3 {
    static long testString(int n) {
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < n; i++) s += "a";
        long end = System.currentTimeMillis();
        System.out.println("String length " + s.length());
        return end - start;
    }
    static long testStringBuilder(int n) {
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append("a");
        long end = System.currentTimeMillis();
        System.out.println("StringBuilder length " + sb.length());
        return end - start;
    }
    static long testStringBuffer(int n) {
        long start = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) sb.append("a");
        long end = System.currentTimeMillis();
        System.out.println("StringBuffer length " + sb.length());
        return end - start;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("String: " + testString(n) + " ms");
        System.out.println("StringBuilder: " + testStringBuilder(n) + " ms");
        System.out.println("StringBuffer: " + testStringBuffer(n) + " ms");
    }
}
