public class InitializerExample {
    static {
        System.out.println("Static Block - Runs Once!");
    }

    {
        System.out.println("Instance Block - Runs Before Constructor!");
    }

    public InitializerExample() {
        System.out.println("Constructor Executed!");
    }

    public static void main(String[] args) {
        System.out.println("Main Method Starts...");
        new InitializerExample(); // First Object
        new InitializerExample(); // Second Object
    }
}
