package week6.assignmentproblems;

abstract class Food{

    public final void prepare(){
        wash();
        cook();
        serve();

    }
    abstract void wash();
    abstract void cook();
    abstract void serve();
}
class Pizza extends Food{
    @Override
    void wash(){
        System.out.println("Pizza plate is washing");
    }
    @Override
    void cook(){
        System.out.println("Pizza is cooking");
    }    @Override
    void serve(){
        System.out.println("Pizza is serving");
    }
}
class Soup  extends Food{
    @Override
    void wash(){
        System.out.println("Soup plate is washing");
    }
    @Override
    void cook(){
        System.out.println("Soup is cooking");
    }
    @Override
    void serve(){
        System.out.println("Soup is serving");
    }
}
public class Foods {
    public static void main(String[] args) {
        Pizza p=new Pizza();
        p.prepare();
        Soup s=new Soup();
        s.prepare();
    }
}
