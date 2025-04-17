// Define the Student class
class Student {
    private int id;
    private String name;
    private double marks;

    // Constructor
    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Overriding the toString() method
    @Override
    public String toString() {
        return "Student[ID=" + id + ", Name=" + name + ", Marks=" + marks + "]";
    }
}

// Main class
public class ToStringExample {
    public static void main(String[] args) {
        // Creating Student objects
        Student s1 = new Student(101, "Alice", 95.5);
        Student s2 = new Student(102, "Bob", 88.0);

        // Printing objects directly (toString() will be called implicitly)
        System.out.println(s1);  // Calls s1.toString()
        System.out.println(s2);  // Calls s2.toString()
    }
}
