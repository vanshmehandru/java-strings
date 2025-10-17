interface Operation {
    int calculate(int a, int b);
}

class Calculator {
    static class Addition {
        int add(int a, int b) {
            return a + b;
        }
    }

    void subtraction() {
        class Subtract {
            int sub(int a, int b) {
                return a - b;
            }
        }
        Subtract s = new Subtract();
        System.out.println("Subtraction: " + s.sub(15, 5));
    }

    void multiplication() {
        Operation mul = new Operation() {
            public int calculate(int a, int b) {
                return a * b;
            }
        };
        System.out.println("Multiplication: " + mul.calculate(6, 7));
    }
}

public class InnerTypeDemo {
    public static void main(String[] args) {
        Calculator.Addition add = new Calculator.Addition();
        System.out.println("Addition: " + add.add(10, 20));

        Calculator calc = new Calculator();
        calc.subtraction();
        calc.multiplication();
    }
}
