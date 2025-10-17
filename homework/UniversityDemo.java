class University {
    String universityName = "Tech University";

    class Department {
        String deptName;

        Department(String deptName) {
            this.deptName = deptName;
        }

        void showDetails() {
            System.out.println("University: " + universityName + ", Department: " + deptName);
        }
    }

    static class ExamCell {
        static void conductExam() {
            System.out.println("ExamCell is conducting semester exams.");
        }
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        University uni = new University();
        University.Department dept = uni.new Department("Computer Science");
        dept.showDetails();
        University.ExamCell.conductExam();
    }
}
