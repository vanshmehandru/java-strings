package week7.practiceproblems;

class Restaurant {
    protected String name;
    public Restaurant(String name) {
        this.name = name;
    }
    public void prepareFood() {
        System.out.println(name + " is preparing generic food");
    }
    public void estimateTime() {
        System.out.println(name + " Estimated time: 30 minutes");
    }
}

class PizzaPlace extends Restaurant {
    public PizzaPlace(String name) {
        super(name);
    }
    @Override
    public void prepareFood() {
        System.out.println(name + " is making delicious pizza with fresh toppings");
    }
    @Override
    public void estimateTime() {
        System.out.println("Pizza ready in 20 minutes");
    }
}

class SushiBar extends Restaurant {
    public SushiBar(String name) {
        super(name);
    }
    @Override
    public void prepareFood() {
        System.out.println(name + " is crafting fresh sushi with precision!");
    }
    @Override
    public void estimateTime() {
        System.out.println("Sushi will be ready in 25 minutes!");
    }
}

public class FoodDelivery {
    public static void main(String[] args) {
        Restaurant order;
        order = new PizzaPlace("Mario's Pizza");
        order.prepareFood();
        order.estimateTime();
        order = new SushiBar("Tokyo Sushi");
        order.prepareFood();
        order.estimateTime();
    }
}
