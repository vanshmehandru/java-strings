class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Asha", 45000);
        Employee e2 = new Employee(102, "Ravi", 52000);
        Employee e3 = new Employee(103, "Meena", 48000);

        System.out.println(e1);
        System.out.println("Class: " + e1.getClass().getName());
        System.out.println(e2);
        System.out.println("Class: " + e2.getClass().getName());
        System.out.println(e3);
        System.out.println("Class: " + e3.getClass().getName());
    }
}
