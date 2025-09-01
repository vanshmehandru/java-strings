package homework;
import java.util.*;

public class NestedLoopFrequency {

   static String[] charFrequency(String s) {
       char[] chars = s.toCharArray();
       int[] freq = new int[chars.length];

       for (int i = 0; i < chars.length; i++) {
           if (chars[i] == '0') continue;
           freq[i] = 1;
           for (int j = i + 1; j < chars.length; j++) {
               if (chars[i] == chars[j]) {
                   freq[i]++;
                   chars[j] = '0';
               }
           }
       }

       int count = 0;
       for (int i = 0; i < chars.length; i++)
           if (chars[i] != '0') count++;

       String[] result = new String[count];
       int idx = 0;
       for (int i = 0; i < chars.length; i++) {
           if (chars[i] != '0')
               result[idx++] = chars[i] + " -> " + freq[i];
       }
       return result;
   }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a string: ");
       String s = sc.nextLine();
       String[] res = charFrequency(s);
       for (String r : res) System.out.println(r);
   }
}
