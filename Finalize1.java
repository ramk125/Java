class Example {
    // Override finalize() method
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called for object cleanup.");
    }
}

public class Finalize1 {
    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();

        obj1 = null;  // Make obj1 eligible for garbage collection
        obj2 = null;  // Make obj2 eligible for garbage collection

        System.gc();  // Request garbage collection
        System.out.println("Main method execution completed.");
    }
}
