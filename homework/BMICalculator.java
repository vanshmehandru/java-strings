package homework;
import java.util.*;

public class BMICalculator {
   static double calculateBMI(double weight, double heightCm) {
       double heightM = heightCm / 100.0;
       return weight / (heightM * heightM);
   }

   static String getStatus(double bmi) {
       if (bmi < 18.5) return "Underweight";
       else if (bmi < 25) return "Normal";
       else if (bmi < 30) return "Overweight";
       else return "Obese";
   }

   static String[][] computeBMI(double[][] hw) {
       int n = hw.length;
       String[][] result = new String[n][4];
       for (int i = 0; i < n; i++) {
           double weight = hw[i][0];
           double height = hw[i][1];
           double bmi = calculateBMI(weight, height);
           String status = getStatus(bmi);
           result[i][0] = String.valueOf(weight);
           result[i][1] = String.valueOf(height);
           result[i][2] = String.format("%.2f", bmi);
           result[i][3] = status;
       }
       return result;
   }

   static void display(String[][] table) {
       System.out.println("Wt(kg)\tHt(cm)\tBMI\tStatus");
       for (int i = 0; i < table.length; i++) {
           System.out.println(table[i][0] + "\t" + table[i][1] + "\t" + table[i][2] + "\t" + table[i][3]);
       }
   }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = 10;
       double[][] hw = new double[n][2];
       System.out.println("Enter weight (kg) and height (cm) for 10 persons:");
       for (int i = 0; i < n; i++) {
           System.out.print("Person " + (i + 1) + " - Weight(kg): ");
           hw[i][0] = sc.nextDouble();
           System.out.print("Person " + (i + 1) + " - Height(cm): ");
           hw[i][1] = sc.nextDouble();
       }

       String[][] table = computeBMI(hw);
       display(table);
   }
}
