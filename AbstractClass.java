abstract class Animal {
    abstract void sound();

    void sleep() {
        System.out.println("This animal sleeps.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();  // Calls overridden method
        dog.sleep();   // Calls inherited method

    }
}
