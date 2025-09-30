package week7.labproblems;

abstract class SmartDevice {
    protected String deviceName;

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    public void status() {
        System.out.println(deviceName + " is online.");
    }
}

class SmartClassroom extends SmartDevice {
    public SmartClassroom(String deviceName) {
        super(deviceName);
    }

    public void controlLighting() {
        System.out.println(deviceName + " lights adjusted.");
    }

    public void controlAC() {
        System.out.println(deviceName + " AC set to optimal temperature.");
    }

    public void controlProjector() {
        System.out.println(deviceName + " projector turned on.");
    }
}

class SmartLab extends SmartDevice {
    public SmartLab(String deviceName) {
        super(deviceName);
    }

    public void manageEquipment() {
        System.out.println(deviceName + " equipment checked.");
    }

    public void safetyCheck() {
        System.out.println(deviceName + " safety systems verified.");
    }
}

class SmartLibrary extends SmartDevice {
    public SmartLibrary(String deviceName) {
        super(deviceName);
    }

    public void trackOccupancy() {
        System.out.println(deviceName + " occupancy monitored.");
    }

    public void checkBookAvailability() {
        System.out.println(deviceName + " book availability updated.");
    }
}

public class SmartCampus {
    public static void main(String[] args) {
        SmartDevice[] devices = {
                new SmartClassroom("Room 101"),
                new SmartLab("Physics Lab"),
                new SmartLibrary("Main Library"),
                new SmartClassroom("Room 102")
        };

        for (SmartDevice d : devices) {
            d.status();

            if (d instanceof SmartClassroom) {
                SmartClassroom sc = (SmartClassroom) d;
                sc.controlLighting();
                sc.controlAC();
                sc.controlProjector();
            } else if (d instanceof SmartLab) {
                SmartLab sl = (SmartLab) d;
                sl.manageEquipment();
                sl.safetyCheck();
            } else if (d instanceof SmartLibrary) {
                SmartLibrary lib = (SmartLibrary) d;
                lib.trackOccupancy();
                lib.checkBookAvailability();
            }

            System.out.println();
        }
    }
}

