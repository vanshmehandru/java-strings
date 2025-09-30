package week7.assignmentproblems;

class SmartDevice {
    String deviceName;

    SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    void basicStatus() {
        System.out.println(deviceName + " is online.");
    }
}

class SmartTV extends SmartDevice {
    int channel;
    int volume;

    SmartTV(String deviceName, int channel, int volume) {
        super(deviceName);
        this.channel = channel;
        this.volume = volume;
    }

    void tvControls() {
        System.out.println("TV Channel: " + channel + ", Volume: " + volume);
    }
}

class SmartThermostat extends SmartDevice {
    int temperature;
    int humidity;

    SmartThermostat(String deviceName, int temperature, int humidity) {
        super(deviceName);
        this.temperature = temperature;
        this.humidity = humidity;
    }

    void thermostatControls() {
        System.out.println("Temperature: " + temperature + "°C, Humidity: " + humidity + "%");
    }
}

class SmartSecurity extends SmartDevice {
    boolean alarm;
    int cameras;

    SmartSecurity(String deviceName, boolean alarm, int cameras) {
        super(deviceName);
        this.alarm = alarm;
        this.cameras = cameras;
    }

    void securityControls() {
        System.out.println("Alarm: " + (alarm ? "ON" : "OFF") + ", Cameras: " + cameras);
    }
}

class SmartKitchen extends SmartDevice {
    String recipe;
    int cookingTime;

    SmartKitchen(String deviceName, String recipe, int cookingTime) {
        super(deviceName);
        this.recipe = recipe;
        this.cookingTime = cookingTime;
    }

    void kitchenControls() {
        System.out.println("Recipe: " + recipe + ", Cooking Time: " + cookingTime + " mins");
    }
}

public class SmartHome {
    public static void main(String[] args) {
        SmartDevice[] devices = {
                new SmartTV("Living Room TV", 5, 25),
                new SmartThermostat("Main Thermostat", 22, 50),
                new SmartSecurity("Home Security", true, 4),
                new SmartKitchen("Oven", "Pizza", 20)
        };

        for (SmartDevice d : devices) {
            d.basicStatus();

            if (d instanceof SmartTV) {
                ((SmartTV) d).tvControls();
            } else if (d instanceof SmartThermostat) {
                ((SmartThermostat) d).thermostatControls();
            } else if (d instanceof SmartSecurity) {
                ((SmartSecurity) d).securityControls();
            } else if (d instanceof SmartKitchen) {
                ((SmartKitchen) d).kitchenControls();
            }

            System.out.println();
        }
    }
}
