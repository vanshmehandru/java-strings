interface Notifier {
    void send(String message);
}

public class Service {
    public void triggerAlert() {
        Notifier n = new Notifier() {
            public void send(String message) {
                System.out.println("Alert: " + message);
            }
        };
        n.send("System Overload!");
    }

    public static void main(String[] args) {
        new Service().triggerAlert();
    }
}
