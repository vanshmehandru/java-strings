package week6.labproblems;

class Instrument{
    String name;
    String material;
    Instrument(String name,String material){
        this.name=name;
        this.material=material;

    }
    void display(){}

}

class Piano extends Instrument{
    String keys;
    Piano(String name, String material,  String keys){
        super(name,material);
        this.keys=keys;


    }
    @Override
    void display(){
        System.out.println(name+" "+material+" "+keys);
    }

}
class Guitar extends Instrument{
    String strings;
    Guitar(String name, String material,  String strings){
        super(name,material);
        this.strings=strings;


    }
    @Override
    void display(){
        System.out.println(name+" "+material+" "+strings);
    }
}
class Drum extends Instrument{
    double diameter;
    Drum(String name, String material, double diameter){
        super(name,material);
        this.diameter=diameter;


    }
    @Override
    void display(){
        System.out.println(name+" "+material+" "+diameter);
    }
}

public class Instruments {
    public static void main(String[] args) {
        Instrument[] band = {
                new Guitar("Accoustic", "Oak wood", "smooth"),
                new Piano("Muti", "plastic", "toned"),
                new Drum("Bass", "metal",23.4 )
        };

        for(Instrument inst: band){
            inst.display();

        }
    }
}
