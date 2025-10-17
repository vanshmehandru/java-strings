class Address implements Cloneable {
    String city;

    Address(String city) {
        this.city = city;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    Person deepClone() throws CloneNotSupportedException {
        Person p = (Person) super.clone();
        p.address = (Address) address.clone();
        return p;
    }
}

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("Meena", new Address("Chennai"));
        Person shallow = (Person) p1.clone();
        Person deep = p1.deepClone();

        p1.address.city = "Delhi";
        System.out.println("Original: " + p1.address.city);
        System.out.println("Shallow: " + shallow.address.city);
        System.out.println("Deep: " + deep.address.city);
    }
}
