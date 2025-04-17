interface Calculator {
    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }
}

public class InterfaceWithoutObjectCreated {
    public static void main(String[] args) {
        // Call static methods directly from the interface
        System.out.println("Addition: " + Calculator.add(5, 3)); // Output: 8
        System.out.println("Subtraction: " + Calculator.subtract(10, 4)); // Output: 6
    }
}
