package week4.homework;
import java.util.*;

class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount() {
        this("Unknown", 0.0);
    }

    BankAccount(String accountHolder) {
        this(accountHolder, 0.0);
    }

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = new Random().nextInt(900000) + 100000;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }

    void displayAccount() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("------------------");
    }
}

public class w4hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double bal = sc.nextDouble();

        BankAccount a1 = new BankAccount();
        BankAccount a2 = new BankAccount(name);
        BankAccount a3 = new BankAccount(name, bal);

        a1.deposit(500);
        a2.deposit(1000);
        a3.withdraw(200);

        a1.displayAccount();
        a2.displayAccount();
        a3.displayAccount();

        sc.close();
    }
}
