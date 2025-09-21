package week6.labproblems;

class Bird{
    void fly(){
        System.out.println("Bird is flying");
    }

}
class Eagle extends Bird{
    @Override
    void fly(){
        System.out.println("Eagle is flying");
    }
}
class Penguin extends Bird{
    @Override
    void fly(){
        System.out.println("Penguin cannot fly");
    }
}

public class Birds {
    public static void main(String[] args) {
        Bird b1 = new Bird();
        Bird b2 = new Eagle();
        Bird b3 = new Penguin();
        b1.fly();
        b2.fly();
        b3.fly();
    }
}
