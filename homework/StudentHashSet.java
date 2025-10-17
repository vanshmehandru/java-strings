import java.util.*;

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student s = (Student) obj;
        return rollNo == s.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    @Override
    public String toString() {
        return rollNo + " - " + name;
    }
}

public class StudentHashSet {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student(11, "Kiran"));
        students.add(new Student(12, "Riya"));
        students.add(new Student(11, "Kiran Duplicate"));

        for (Student s : students)
            System.out.println(s);
    }
}
