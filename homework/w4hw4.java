package week4.homework;
import java.util.*;

class FoodOrder {
    String customerName;
    String foodItem;
    int quantity;
    double price;
    static final double rate = 100.0;

    FoodOrder() {
        this("Unknown", "Unknown", 0, 0.0);
    }

    FoodOrder(String foodItem) {
        this("Customer", foodItem, 1, rate);
    }

    FoodOrder(String foodItem, int quantity) {
        this("Customer", foodItem, quantity, quantity * rate);
    }

    FoodOrder(String customerName, String foodItem, int quantity, double price) {
        this.customerName = customerName;
        this.foodItem = foodItem;
        this.quantity = quantity;
        this.price = price;
    }

    void printBill() {
        System.out.println("Customer: " + customerName);
        System.out.println("Food Item: " + foodItem);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + price);
        System.out.println("------------------");
    }
}

public class w4hw4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter food item: ");
        String item = sc.nextLine();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        FoodOrder o1 = new FoodOrder();
        FoodOrder o2 = new FoodOrder(item);
        FoodOrder o3 = new FoodOrder(item, qty);
        FoodOrder o4 = new FoodOrder(name, item, qty, qty * 100.0);

        o1.printBill();
        o2.printBill();
        o3.printBill();
        o4.printBill();

        sc.close();
    }
}
