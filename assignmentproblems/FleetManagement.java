package week7.assignmentproblems;

class Vehicle {
    void dispatch() {
        System.out.println("Vehicle is ready for service.");
    }
}

class Bus extends Vehicle {
    int capacity;
    String route;

    Bus(String route, int capacity) {
        this.route = route;
        this.capacity = capacity;
    }

    @Override
    void dispatch() {
        System.out.println("Bus on route " + route + " with capacity " + capacity + " is dispatched.");
    }
}

class Taxi extends Vehicle {
    String passenger;
    double distance;

    Taxi(String passenger, double distance) {
        this.passenger = passenger;
        this.distance = distance;
    }

    @Override
    void dispatch() {
        double fare = distance * 15;
        System.out.println("Taxi for " + passenger + " dispatched. Distance: " + distance + " km, Fare: $" + fare);
    }
}

class Train extends Vehicle {
    int cars;
    String schedule;

    Train(String schedule, int cars) {
        this.schedule = schedule;
        this.cars = cars;
    }

    @Override
    void dispatch() {
        System.out.println("Train on schedule " + schedule + " with " + cars + " cars is dispatched.");
    }
}

class Bike extends Vehicle {
    String user;
    double distance;

    Bike(String user, double distance) {
        this.user = user;
        this.distance = distance;
    }

    @Override
    void dispatch() {
        System.out.println("Bike for " + user + " dispatched for " + distance + " km eco-friendly trip.");
    }
}

public class FleetManagement {
    public static void main(String[] args) {
        Vehicle[] fleet = {
                new Bus("Downtown Loop", 50),
                new Taxi("Alice", 12.5),
                new Train("9:00 AM", 10),
                new Bike("Bob", 5)
        };

        for (Vehicle v : fleet) {
            v.dispatch();
        }
    }
}

