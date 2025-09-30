package week7.assignmentproblems;

class HotelBooking {

    void calculatePrice(String roomType, int nights) {
        int price = 1000 * nights;
        System.out.println("Standard Booking: Room " + roomType + ", Nights: " + nights);
        System.out.println("Total Price: " + price);
    }

    void calculatePrice(String roomType, int nights, double seasonalMultiplier) {
        int base = 1000 * nights;
        double total = base * seasonalMultiplier;
        System.out.println("Seasonal Booking: Room " + roomType + ", Nights: " + nights + ", Multiplier: " + seasonalMultiplier);
        System.out.println("Total Price: " + total);
    }

    void calculatePrice(String roomType, int nights, double corporateDiscount, boolean mealPackage) {
        int base = 1000 * nights;
        double discountPrice = base - (base * corporateDiscount);
        int mealCost = mealPackage ? 500 : 0;
        double total = discountPrice + mealCost;
        System.out.println("Corporate Booking: Room " + roomType + ", Nights: " + nights);
        System.out.println("Discount Applied: " + (corporateDiscount * 100) + "%");
        System.out.println("Meal Package Cost: " + mealCost);
        System.out.println("Total Price: " + total);
    }

    void calculatePrice(String roomType, int nights, int guests, int decorationFee, boolean catering) {
        int base = 1000 * nights;
        int cateringCost = catering ? 200 * guests : 0;
        int total = base + decorationFee + cateringCost;
        System.out.println("Wedding Booking: Room " + roomType + ", Nights: " + nights + ", Guests: " + guests);
        System.out.println("Decoration Fee: " + decorationFee);
        System.out.println("Catering Cost: " + cateringCost);
        System.out.println("Total Price: " + total);
    }
}

public class Hotel {
    public static void main(String[] args) {
        HotelBooking hb = new HotelBooking();
        hb.calculatePrice("Deluxe", 3);
        hb.calculatePrice("Deluxe", 3, 1.2);
        hb.calculatePrice("Deluxe", 3, 0.1, true);
        hb.calculatePrice("Deluxe", 3, 50, 2000, true);
    }
}

