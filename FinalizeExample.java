class Car {
    String model;

    Car(String model) {
        this.model = model;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(model + " is destroyed by garbage collector.");
    }
}

public class FinalizeExample {
    public static void main(String[] args) {
        Car car1 = new Car("BMW");
        Car car2 = new Car("Audi");

        // Make objects eligible for garbage collection
        car1 = null;
        car2 = null;

        // Request garbage collection (optional)
        System.gc();

        // Adding a small delay to give GC time to run (Not guaranteed)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main method finished.");
    }
}
