interface Animal {
    void sound(); // method signature (no body!)

    void eat();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }

    public void eat() {
        System.out.println("Dog eats bones");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();
        myDog.eat();
    }
}
