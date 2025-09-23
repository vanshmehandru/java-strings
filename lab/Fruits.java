package week6.labproblems;

class Fruit {
    protected String color;
    protected String taste;
    Fruit(String color, String taste) {
        this.color = color;
        this.taste = taste;

    }

}
class Apple extends Fruit {
    String variety;
    Apple(String c, String t, String v) {
        super(c, t);
        this.variety = v;
        System.out.println("Apple variety is: " + this.variety);
        System.out.println("Apple variety is: " + this.color);
        System.out.println("Apple variety is: " + this.taste);
    }


}

public class Fruits {
    public static void main(String[] args) {
        Apple a1 = new Apple("Red", "decent", "kashmiri");



    }

}
