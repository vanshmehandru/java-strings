package week8.labproblems;



abstract class Fruit {
    protected String taste;
    protected String color;

    abstract public void showDetails();

}

interface Edible{
    void nutrientsInfo();

}
class Apple extends Fruit implements Edible{
    public String variety;
    protected String taste;
    protected String color;

    public Apple(String taste, String color) {
        this.taste = taste;
        this.color = color;
    }

    @Override
    public void showDetails() {
        System.out.println("Apple of color: " + color + " and taste is : " + taste);
    }
    @Override
    public void nutrientsInfo() {
        System.out.println("Apple has good nutrients.");
    }
}

public class FruitTest {
    public static void main(String[] args) {
        Fruit f1 = new Apple("good", "red");
        f1.showDetails();
        Edible f2 =  new Apple("good", "red");
        f2.nutrientsInfo();
    }
}
