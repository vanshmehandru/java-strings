package week8.practiceproblems;

// File: BankAccount.java
abstract class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;

    }

    public abstract void calculateInterest();

    public void displayBalance() {
        System.out.println("Your balance is: " + balance);

    }
}

class SavingsAccount extends BankAccount {
    public double interest;
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void calculateInterest() {
        interest = balance *0.04;
        System.out.println("Your interest is: " + interest);


    }
}

 class CurrentAccount extends BankAccount {
    public double interest;
    public CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    public void calculateInterest() {
        interest = balance * 0.02;
        System.out.println("Your interest is: " + interest);


    }
}

public class BankTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new SavingsAccount(500);
        bankAccount.displayBalance();
        bankAccount.calculateInterest();
        BankAccount bankAccount2 = new CurrentAccount(1500);
        bankAccount2.displayBalance();
        bankAccount2.calculateInterest();

    }
}
