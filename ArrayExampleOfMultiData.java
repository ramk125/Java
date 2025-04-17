import java.util.Scanner;

class Student {
    String name;
    int id;
    int age;

    // Constructor
    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    // Method to display student details
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}

public class ArrayExampleOfMultiData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5]; // Array to store 5 students

        // Taking input from user
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();

            // Creating Student object and storing in array
            students[i] = new Student(name, id, age);
        }

        // Displaying all students
        System.out.println("\nStudent Details:");
        for (Student s : students) {
            s.display();
        }

        scanner.close();
    }
}
