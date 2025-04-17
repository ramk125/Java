class Parent {
    final void show() {  
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    // void show() {  // Compilation error: cannot override final method
    //     System.out.println("Trying to override final method");
    // }
}

public class FinalMethod {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();  // Calls the method from Parent class
    }
}
