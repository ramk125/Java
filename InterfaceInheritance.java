interface Switchable {
    void turnOn();
    void turnOff();
}

interface Dimmable {
    void setBrightness(int level);
}

interface SmartDevice extends Switchable, Dimmable {
    void connectToWiFi(String network);
}

// A smart light bulb implements all methods
class SmartLight implements SmartDevice {
    public void turnOn() {
        System.out.println("Smart light turned on");
    }

    public void turnOff() {
        System.out.println("Smart light turned off");
    }

    public void setBrightness(int level) {
        System.out.println("Brightness set to " + level + "%");
    }

    public void connectToWiFi(String network) {
        System.out.println("Connected to WiFi: " + network);
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        SmartLight light = new SmartLight();
        light.turnOn();
        light.setBrightness(75);
        light.connectToWiFi("HomeNetwork");
        light.turnOff();
    }
}
