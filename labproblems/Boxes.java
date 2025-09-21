package week6.labproblems;

class Box{
    void pack(){
        System.out.println("Packing Box");
    }
    void unpack(){
        System.out.println("Unpacking Box");
    }
    Box(){
        System.out.println("Creating Box");
    }

}
class GiftBox extends Box{
    @Override
    void  pack(){
        System.out.println("Packing Gift");
        super.pack();
    }

}


public class Boxes {
    public static void main(String[] args) {
        Box bx = new Box();
        Box gb = new GiftBox();
        gb.pack();
    }
}
