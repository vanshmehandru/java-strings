package homework;
import java.util.*;

public class FirstNonRepeating {
   static char firstNonRepeating(String s) {
       int[] freq = new int[256];
       int n = s.length();

       for (int i = 0; i < n; i++) freq[s.charAt(i)]++;

       for (int i = 0; i < n; i++)
           if (freq[s.charAt(i)] == 1) return s.charAt(i);

       return '\0'; 
   }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a string: ");
       String s = sc.nextLine();
       char c = firstNonRepeating(s);
       if (c != '\0') System.out.println("First non-repeating character: " + c);
       else System.out.println("No non-repeating character found");
   }
}
