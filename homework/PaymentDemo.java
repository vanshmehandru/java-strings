interface Discount {
    double apply(double amount);
}

class Payment {
    void processTransaction(double amount) {
        class Validator {
            boolean isValid(double amt) {
                return amt > 0;
            }
        }
        Validator v = new Validator();
        if (v.isValid(amount)) {
            Discount d = new Discount() {
                public double apply(double amt) {
                    return amt * 0.9;
                }
            };
            System.out.println("Original: " + amount);
            System.out.println("After Discount: " + d.apply(amount));
        } else {
            System.out.println("Invalid payment amount.");
        }
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment p = new Payment();
        p.processTransaction(2000);
    }
}
