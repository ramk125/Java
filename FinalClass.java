final class Vehicle {
    void display() {
        System.out.println("This is a vehicle.");
    }
}

// class Car extends Vehicle { // ❌ Compilation Error: Cannot inherit from final class
//     void show() {
//         System.out.println("This is a car.");
//     }
// }

public class FinalClass {
    public static void main(String[] args) {
        Vehicle obj = new Vehicle();
        obj.display();
    }
}
