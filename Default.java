interface A {
    default void show() {
        System.out.println("A's default method");
    }
}

interface B {
    default void show() {
        System.out.println("B's default method");
    }
}

// C implements both A and B (conflict!)
class C implements A, B {
    // Must resolve the conflict
    public void show() {
        System.out.println("C's custom method");
    }
}

public class Default {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();  // Output: C's custom method
    }
}
