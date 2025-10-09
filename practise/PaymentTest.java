package week8.practiceproblems;

// File: PaymentGateway.java
interface PaymentGateway {


    void pay(double amount);

    void refund(double amount);
}

class CreditCardPayment implements PaymentGateway {

    @Override
    public void pay(double amount) {
        System.out.println("Paid via Credit Card");

    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund to Credit Card");

    }
}

class UPIPayment implements PaymentGateway {

    @Override
    public void pay(double amount) {
        System.out.println("Paid via UPI");

    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund to UPI");

    }
}

public class PaymentTest {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = new CreditCardPayment();
        paymentGateway.pay(500);
        paymentGateway.refund(500);
        PaymentGateway paymentGateway2 = new CreditCardPayment();
        paymentGateway2.pay(1500);
        paymentGateway2.refund(1500);

    }
}
