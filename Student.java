public class Student {
    String name;
    int age;

    // Instance Initializer Block
    {
        System.out.println("Initializing Student Object...");
    }

    // Constructor 1
    public Student(String name) {
        this.name = name;
        System.out.println("Name: " + name);
    }

    // Constructor 2
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        new Student("Alice");
        new Student("Bob", 22);
    }
}
