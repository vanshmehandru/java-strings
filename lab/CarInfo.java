class Car {
    String brand;
    String model;
    int year;

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Year: " + year;
    }
}

public class CarInfo {
    public static void main(String[] args) {
        Car car = new Car("Hyundai", "i20", 2022);
        System.out.println(car);
        System.out.println("Class Name: " + car.getClass().getName());
    }
}
