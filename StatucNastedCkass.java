class Outer {
    static int data = 100;

    static class Nested {
        void display() {
            System.out.println("Static Data: " + data);
        }
    }
}

public class StatucNastedCkass {
    public static void main(String[] args) {
        Outer.Nested obj = new Outer.Nested();
        obj.display();
    }
}
