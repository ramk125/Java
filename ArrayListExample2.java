import java.util.ArrayList;
import java.util.Scanner;
//import java.lang.String

// Student class
class Student {
    private int id;
    private String name;
    private double grade;

    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getGrade() { return grade; }

    public void displayStudent() {
        System.out.println("ID: " + id + " | Name: " + name + " | Grade: " + grade);
    }
}

// Student Management System
public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Remove Student by ID");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number between 1 and 4.");
                scanner.next(); // Clear invalid input
                continue;
            }

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    // Prevent duplicate student ID
                    if (students.stream().anyMatch(s -> s.getId() == id)) {
                        System.out.println("⚠ Error: Student ID already exists! Try again.");
                        break;
                    }

                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();

                    double grade;
                    while (true) {
                        System.out.print("Enter Student Grade (numeric only): ");
                        if (scanner.hasNextDouble()) {
                            grade = scanner.nextDouble();
                            break;
                        } else {
                            System.out.println("⚠ Invalid input! Please enter a numeric grade.");
                            scanner.next(); // Discard invalid input
                        }
                    }

                    students.add(new Student(id, name, grade));
                    System.out.println("✅ Student added successfully!");
                    break;

                case 2:
                    System.out.println("\n===== Student List =====");
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        for (Student s : students) {
                            s.displayStudent();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to Remove: ");
                    int removeId = scanner.nextInt();

                    boolean removed = students.removeIf(s -> s.getId() == removeId);
                    if (removed) {
                        System.out.println("✅ Student removed successfully.");
                    } else {
                        System.out.println("⚠ No student found with this ID.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
