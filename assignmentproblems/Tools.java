package week6.assignmentproblems;

class Tool{
    private String name;
    protected String material;
    public boolean isAvailable;
    Tool(String name,String material,boolean isAvailable){
        this.name=name;
        this.material=material;
        this.isAvailable=true;
        System.out.println("Creating Tool");
        System.out.println("Tool name:" + name+ " material:" + material + " and Available:" + isAvailable);

    }
}

class Hammer extends Tool{
    String name;
    String material;
    boolean isAvailable;
    Hammer(String name,String material,boolean isAvailable){
        super(name,material,isAvailable);
    }
}
public class Tools {
    public static void main(String[] args) {
        Hammer h1 = new Hammer("BallPin", "Wood", true);
    }
}
