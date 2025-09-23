package week6.assignmentproblems;

class Light{
    boolean isOn;
    String color;
    Light(){
        this(true, "Yellow");
        System.out.println("Light Bulb");
    }
    Light(boolean isOn,String color){
        this.isOn = isOn;
        this.color = color;
        System.out.println("Light is On: " + isOn + "Color is : "+ color);

    }


}

class LED extends Light{
    boolean isOn;
    String color;
    boolean isBlinking;
    LED(){
        this(true);
    }
    LED(boolean isOn,String color ){
        super(isOn, "Red");


    }
    LED(boolean isBlinking){
        this.isBlinking = isBlinking;
        if(isBlinking){
            System.out.println("Light is Blinking");
        }
    }

}
public class Lights {
    public static void main(String[] args) {
        Light l1 =  new Light();
        Light l2 =  new Light(true, "green");
        LED led = new LED();
        LED led2 = new LED(false, "red");
    }
}
