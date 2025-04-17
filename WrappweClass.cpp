// Custom Wrapper Class for an Integer
public class IntWrapper {
    private int value; // Encapsulated primitive

    // Constructor
    public IntWrapper(int value) {
        this.value = value;
    }

    // Getter method
    public int getValue() {
        return value;
    }

    // Setter method with validation
    public void setValue(int value) {
        if (value >= 0) { // Ensuring only non-negative values
            this.value = value;
        } else {
            System.out.println("Invalid value. Must be non-negative.");
        }
    }

    // Display method
    public void display() {
        System.out.println("Wrapped Value: " + value);
    }

    public static void main(String[] args) {
        IntWrapper obj = new IntWrapper(10); // Create object with value 10
        obj.display(); // Output: Wrapped Value: 10

        obj.setValue(50); // Modify value
        obj.display(); // Output: Wrapped Value: 50

        obj.setValue(-5); // Invalid input
        obj.display(); // Still 50 because -5 was rejected
    }
}
