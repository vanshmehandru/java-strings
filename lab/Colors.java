package week6.labproblems;

class Color{
    String name;
    Color(){
        this("Red");
        System.out.println("Color is created");

    }
    Color(String name){
        this.name=name;
        System.out.println("Color :" +name);

    }
}
class PrimaryColor extends Color{
    String intensity;
    PrimaryColor(){

        this("High");
        System.out.println("Primary Color is created");
    }
    PrimaryColor(String intensity){
        super("Blue");
        this.intensity=intensity;
        System.out.println("Intensity:"+intensity);
    }
}
class RedColor extends PrimaryColor{
    String shade;
    RedColor(){
        this("blunt");
        System.out.println("Red Color is created");
    }
    RedColor(String shade){
        super("low");
        this.shade=shade;
        System.out.println("Shade:" +shade);
    }
}

public class Colors {
    public static void main(String[] args) {
        Color colors=new Color();
        Color colors1=new Color("Green");
        Color colors2=new PrimaryColor();
        Color colors5=new PrimaryColor("medium");
        Color colors3=new RedColor();
        Color colors4=new RedColor("Mahroon");
    }


}

