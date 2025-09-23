package week6.assignmentproblems;
class basicMath{
    int result;
    static final int free = 0;

    int calculate(int a, int b) {
        System.out.println("Two numbers are: " + a + " and " + b);
        result = a + b;
        return result;
    }
    int calculate(int a, int b, int c) {
        System.out.println("Two numbers are: " + a + " and " + b + " and " + c);
        result = a + b + c;
        return result;
    }
    int calculate() {
        System.out.println("Two numbers are: " + free);
        result = free;
        return result;
    }
}

class AdvancedMaths extends basicMath{
    int calculate(int a, int b, int c, int d) {
        System.out.println(" numbers are: " + a + " and " + b + " and " + c + " and " + d);
        result = a + b + c + d;
        return result;
    }
}

public class BasicMaths {
    public static void main(String[] args) {
        AdvancedMaths advancedMaths = new AdvancedMaths();
        advancedMaths.calculate(2,3);
        advancedMaths.calculate(4,6,7);
        advancedMaths.calculate();
        advancedMaths.calculate(1,2,3,5);
    }
}
