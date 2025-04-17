class Abc {
    int a, b;

    // Constructor
    Abc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Method to add and print the sum
    void add() {
        System.out.println("Sum: " + (a + b));
    }
}

public class TestConstructor {
    public static void main(String[] args) {
        // Create an object and call the add method
        Abc obj = new Abc(23, 43);
        obj.add();
    }
}
