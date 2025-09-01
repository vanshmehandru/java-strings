package homework;
import java.util.*;

public class CharFrequency {
   static String[][] findFrequency(String s) {
       int[] freq = new int[256];
       int n = s.length();

       for (int i = 0; i < n; i++) freq[s.charAt(i)]++;

       String[][] result = new String[n][2];
       int idx = 0;
       for (int i = 0; i < n; i++) {
           char c = s.charAt(i);
           if (freq[c] > 0) {
               result[idx][0] = String.valueOf(c);
               result[idx][1] = String.valueOf(freq[c]);
               freq[c] = 0;
               idx++;
           }
       }
       return Arrays.copyOf(result, idx);
   }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a string: ");
       String s = sc.nextLine();
       String[][] res = findFrequency(s);
       System.out.println("Character | Frequency");
       for (String[] r : res)
           System.out.println("    " + r[0] + "      |    " + r[1]);
   }
}
