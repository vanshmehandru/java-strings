package week7.assignmentproblems;

class MedicalStaff {
    String name;
    int id;

    MedicalStaff(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void shiftSchedule() {
        System.out.println(name + " (ID: " + id + ") shift scheduled.");
    }

    void idCardAccess() {
        System.out.println(name + " (ID: " + id + ") ID card access granted.");
    }

    void payrollProcessing() {
        System.out.println(name + " (ID: " + id + ") payroll processed.");
    }
}

class Doctor extends MedicalStaff {
    Doctor(String name, int id) {
        super(name, id);
    }

    void diagnose() {
        System.out.println(name + " is diagnosing patients.");
    }

    void prescribe() {
        System.out.println(name + " is prescribing medicine.");
    }

    void performSurgery() {
        System.out.println(name + " is performing surgery.");
    }
}

class Nurse extends MedicalStaff {
    Nurse(String name, int id) {
        super(name, id);
    }

    void administerMedicine() {
        System.out.println(name + " is administering medicine.");
    }

    void monitorPatient() {
        System.out.println(name + " is monitoring patients.");
    }

    void assistProcedure() {
        System.out.println(name + " is assisting procedures.");
    }
}

class Technician extends MedicalStaff {
    Technician(String name, int id) {
        super(name, id);
    }

    void operateEquipment() {
        System.out.println(name + " is operating equipment.");
    }

    void runTests() {
        System.out.println(name + " is running tests.");
    }

    void maintainInstruments() {
        System.out.println(name + " is maintaining instruments.");
    }
}

class Administrator extends MedicalStaff {
    Administrator(String name, int id) {
        super(name, id);
    }

    void scheduleAppointments() {
        System.out.println(name + " is scheduling appointments.");
    }

    void manageRecords() {
        System.out.println(name + " is managing records.");
    }
}

public class Hospital {
    public static void main(String[] args) {
        MedicalStaff[] staff = {
                new Doctor("Dr. Smith", 101),
                new Nurse("Nina", 102),
                new Technician("Tom", 103),
                new Administrator("Anna", 104)
        };

        for (MedicalStaff m : staff) {
            m.shiftSchedule();
            m.idCardAccess();
            m.payrollProcessing();
            System.out.println();
        }
    }
}

