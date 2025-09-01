package homework;
import java.util.*;

public class UniqueCharacters {
   static int getLength(String s) {
       int count = 0;
       try {
           while (true) {
               s.charAt(count);
               count++;
           }
       } catch (Exception e) {
           return count;
       }
   }

   static char[] findUnique(String s) {
       int n = getLength(s);
       char[] temp = new char[n];
       int k = 0;

       for (int i = 0; i < n; i++) {
           char c = s.charAt(i);
           boolean unique = true;
           for (int j = 0; j < i; j++) {
               if (s.charAt(j) == c) {
                   unique = false;
                   break;
               }
           }
           if (unique) temp[k++] = c;
       }

       char[] result = new char[k];
       for (int i = 0; i < k; i++) result[i] = temp[i];
       return result;
   }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a string: ");
       String s = sc.nextLine();
       char[] uniqueChars = findUnique(s);
       System.out.print("Unique characters: ");
       for (char c : uniqueChars) System.out.print(c + " ");
   }
}

