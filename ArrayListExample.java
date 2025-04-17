import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

// Student class
class Student {
    private int id;
    private String name;
    private double grade;

    // Constructor
    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Getter methods
    public int getId() { return id; }
    public String getName() { return name; }
    public double getGrade() { return grade; }

    // Display student details
    public void displayStudent() {
        System.out.println("ID: " + id + " | Name: " + name + " | Grade: " + grade);
    }
}

// Student Management System
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students (Sorted by Grade)");
            System.out.println("3. Remove Student by ID");
            System.out.println("4. Search Student by ID");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    // Check for duplicate ID
                    if (students.stream().anyMatch(s -> s.getId() == id)) {
                        System.out.println("Error: Student ID already exists! Try again.");
                        break;
                    }

                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Student Grade: ");
                    double grade = scanner.nextDouble();
                    
                    students.add(new Student(id, name, grade));
                    System.out.println("✅ Student added successfully!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        // Sort students by grade before displaying
                        students.sort(Comparator.comparingDouble(Student::getGrade).reversed());
                        System.out.println("\n===== Student List (Sorted by Grade) =====");
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
                        System.out.println("⚠ Student ID not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Student ID to Search: ");
                    int searchId = scanner.nextInt();
                    Student foundStudent = students.stream()
                        .filter(s -> s.getId() == searchId)
                        .findFirst()
                        .orElse(null);

                    if (foundStudent != null) {
                        System.out.println("\nStudent Found:");
                        foundStudent.displayStudent();
                    } else {
                        System.out.println("⚠ No student found with this ID.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
