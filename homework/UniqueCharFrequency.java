package homework;
import java.util.*;

public class UniqueCharFrequency {

   static char[] uniqueCharacters(String s) {
       int n = s.length();
       char[] temp = new char[n];
       int idx = 0;
       for (int i = 0; i < n; i++) {
           char c = s.charAt(i);
           boolean found = false;
           for (int j = 0; j < idx; j++) {
               if (temp[j] == c) {
                   found = true;
                   break;
               }
           }
           if (!found) temp[idx++] = c;
       }
       return Arrays.copyOf(temp, idx);
   }

   static String[][] charFrequency(String s) {
       int[] freq = new int[256];
       for (int i = 0; i < s.length(); i++) freq[s.charAt(i)]++;

       char[] uniques = uniqueCharacters(s);
       String[][] result = new String[uniques.length][2];
       for (int i = 0; i < uniques.length; i++) {
           result[i][0] = String.valueOf(uniques[i]);
           result[i][1] = String.valueOf(freq[uniques[i]]);
       }
       return result;
   }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a string: ");
       String s = sc.nextLine();
       String[][] res = charFrequency(s);
       System.out.println("Character | Frequency");
       for (String[] r : res)
           System.out.println("    " + r[0] + "      |    " + r[1]);
   }
}
