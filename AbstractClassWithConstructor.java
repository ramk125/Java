abstract class Person {
    Person(String name) {  
        System.out.println("Person constructor called: " + name);
    }
}

class Student extends Person {
    Student() {
        super("John");
        System.out.println("Student constructor called");
    }
}

public class AbstractClassWithConstructor {
    public static void main(String[] args) {
        Student st = new Student();  // Works now!
    }
}
