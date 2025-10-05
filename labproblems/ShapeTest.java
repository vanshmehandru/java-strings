package week8.labproblems;

abstract class Shape{
    public double area;
    public double perimeter;

    abstract double calculateArea();
    abstract double calculatePerimeter();

}
interface Drawable{
    void draw();
}

class Circle extends Shape implements Drawable{
    public double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;

    }
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

}
public class ShapeTest {
    public static  void main(String[] args) {
        Shape c =  new Circle(5);
        c.calculateArea();
        c.calculatePerimeter();
        Drawable d =  new Circle(5);
        d.draw();
    }
}
