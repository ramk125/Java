class Counter {
    static int count = 0;  // Static variable

    static void increment() {
        count++;
    }
}

public class StaticVariableExample {
    public static void main(String[] args) {
        Counter.increment();
        Counter.increment();
        System.out.println("Count: " + Counter.count);  // Output: Count: 2
    }
}
