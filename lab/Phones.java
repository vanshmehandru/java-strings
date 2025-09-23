package week6.labproblems;

class Phone{
    protected String brand;
    protected String model;

    Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;

    }

}
class SmartPhone extends Phone{
    String os;
    SmartPhone(String brand, String model, String OperatingSystem) {
        super(brand, model);
        this.os =  OperatingSystem;
        System.out.println("Operating System is "+OperatingSystem);
        System.out.println("Brand is "+brand);
        System.out.println("Model is "+model);
    }
}

public class Phones {
    public static void main(String[] args) {
        SmartPhone s1=new SmartPhone("Redmi","15 Gpro ","Android");
    }
}
