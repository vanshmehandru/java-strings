import java.util.*;

class Calculator {
    static int eval(String exp) {
        exp = exp.replaceAll("\\s+", "");
        Stack<Integer> num = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (Character.isDigit(c)) {
                int val = 0;
                while (i < exp.length() && Character.isDigit(exp.charAt(i)))
                    val = val * 10 + (exp.charAt(i++) - '0');
                i--;
                num.push(val);
            } else if (c == '(') op.push(c);
            else if (c == ')') {
                while (op.peek() != '(') num.push(apply(op.pop(), num.pop(), num.pop()));
                op.pop();
            } else {
                while (!op.empty() && prec(op.peek()) >= prec(c))
                    num.push(apply(op.pop(), num.pop(), num.pop()));
                op.push(c);
            }
        }
        while (!op.empty()) num.push(apply(op.pop(), num.pop(), num.pop()));
        return num.pop();
    }

    static int apply(char op, int b, int a) {
        if (op == '+') return a + b;
        if (op == '-') return a - b;
        if (op == '*') return a * b;
        return a / b;
    }

    static int prec(char c) {
        if (c == '+' || c == '-') return 1;
        if (c == '*' || c == '/') return 2;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        System.out.println("Result: " + eval(exp));
    }
}
