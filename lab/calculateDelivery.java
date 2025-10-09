package week7.labproblems;
class FoodDelivery {
    // Basic delivery
    public void calculateDelivery(double distance) {
        double cost = distance * 10;
        System.out.println("Basic Delivery: Distance = " + distance + " km, Cost = ₹" + cost);
    }

    // Premium delivery
    public void calculateDelivery(double distance, double priorityFee) {
        double cost = (distance * 10) + priorityFee;
        System.out.println("Premium Delivery: Distance = " + distance + " km + Priority Fee = ₹" + priorityFee + " → Total = ₹" + cost);
    }

    // Group delivery
    public void calculateDelivery(double distance, int numOrders, double discountPerOrder) {
        double cost = (distance * 10) - (numOrders * discountPerOrder);
        if (cost < 0) cost = 0;
        System.out.println("Group Delivery: Distance = " + distance + " km, Orders = " + numOrders + ", Discount = ₹" + (numOrders * discountPerOrder) + " → Total = ₹" + cost);
    }

    // Festival special
    public void calculateDelivery(double distance, double discountPercent, double freeLimit) {
        double cost = distance * 10;
        if (cost >= freeLimit) {
            cost = 0;
            System.out.println("Festival Special: Free delivery! Order exceeds ₹" + freeLimit);
        } else {
            double discount = (cost * discountPercent) / 100;
            cost -= discount;
            System.out.println("Festival Special: Distance = " + distance + " km, Discount = " + discountPercent + "% → Total = ₹" + cost);
        }
    }

    public static void main(String[] args) {
        FoodDelivery fd = new FoodDelivery();

        fd.calculateDelivery(5);                              // basic
        fd.calculateDelivery(8, 50);                          // premium
        fd.calculateDelivery(10, 3, 5);                       // group
        fd.calculateDelivery(15, 20, 200);                    // festival
    }
}

