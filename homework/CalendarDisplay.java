package homework;
import java.util.Scanner;

public class CalendarDisplay {

   static String[] months = {
           "January", "February", "March", "April", "May", "June",
           "July", "August", "September", "October", "November", "December"
   };

   static int[] daysInMonth = {
           31, 28, 31, 30, 31, 30,
           31, 31, 30, 31, 30, 31
   };

   static boolean isLeapYear(int year) {
       return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
   }

   static int getNumberOfDays(int month, int year) {
       if (month == 2 && isLeapYear(year)) {
           return 29;
       }
       return daysInMonth[month - 1];
   }

   static int getFirstDay(int month, int year) {
       int d = 1; // we want the first day
       int y0 = year - (14 - month) / 12;
       int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
       int m0 = month + 12 * ((14 - month) / 12) - 2;
       return (d + x + (31 * m0) / 12) % 7;
   }

   static void displayCalendar(int month, int year) {
       int days = getNumberOfDays(month, year);
       int startDay = getFirstDay(month, year);

       // Header
       System.out.println("      " + months[month - 1] + " " + year);
       System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

       // First line indentation
       for (int i = 0; i < startDay; i++) {
           System.out.print("    ");
       }

       // Print days of the month
       for (int day = 1; day <= days; day++) {
           System.out.printf("%4d", day);

           // New line after Saturday
           if ((day + startDay) % 7 == 0) {
               System.out.println();
           }
       }
       System.out.println();
   }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter month (1-12): ");
       int month = sc.nextInt();

       System.out.print("Enter year: ");
       int year = sc.nextInt();

       displayCalendar(month, year);
   }
}
