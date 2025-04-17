interface Animal {
    static void sound() {
        System.out.println("Animals make sounds");
    }
}

class Dog implements Animal {
    // This is NOT overriding — it's a separate static method
    static void sound() {
        System.out.println("Dogs bark");
    }
}

public class InterfaceStaticOverrideDemo {
    public static void main(String[] args) {
        Animal.sound();  // Output: Animals make sounds
        Dog.sound();      // Output: Dogs bark
    }
}
