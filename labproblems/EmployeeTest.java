package week8.labproblems;

abstract class Employee{
    public double salary;
    public String name;

    abstract public double  calculateBonus();
}

interface Payable{
    void generatePaySlip();
}

class Manager extends Employee implements Payable{
    public double salary;
    public String name;
    Manager(double salary, String name){
        this.salary = salary;
        this.name = name;
    }
    @Override
    public double calculateBonus() {
        return salary * 0.3;
    }
    @Override
    public void generatePaySlip() {
        System.out.println("Pay Slip: "+ calculateBonus());
    }

}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Manager(100000, "MJ");
        e1.calculateBonus();
        Payable e2 = new Manager(120000, "SJ");
        e2.generatePaySlip();


    }
}
