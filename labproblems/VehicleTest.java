package week8.labproblems;

abstract class Vehicle{
    protected int speed;
    protected String fuelType;
     abstract public void startEngine();
}
interface Maintainable{
    void serviceInfo();

}
class Car extends Vehicle implements Maintainable{
    @Override
    public void startEngine() {
        System.out.println("Starting Car");
    }
    @Override
    public void serviceInfo() {
        System.out.println("Service Info");
    }

}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.startEngine();
        Maintainable maintainable = new Car();
        maintainable.serviceInfo();

    }
}
