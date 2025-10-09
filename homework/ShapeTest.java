package week8.assignmentproblems;

abstract class Shape {
    abstract double area();
    abstract double perimeter();

    void displayInfo() {
        System.out.println("This is a shape with area and perimeter.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }

    void display() {
        displayInfo();
        System.out.println("Shape: Circle");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
        System.out.println();
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }

    void display() {
        displayInfo();
        System.out.println("Shape: Rectangle");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
        System.out.println();
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.display();

        Rectangle r = new Rectangle(4, 6);
        r.display();
    }
}

