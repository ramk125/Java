import java.util.Scanner;

public class ArrayExampleOfMultiData2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 5; // Number of students
        String[][] students = new String[size][3]; // 2D array: rows = students, columns = (ID, Name, Age)

        // Taking input from user
        for (int i = 0; i < size; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Enter ID: ");
            students[i][0] = scanner.nextLine(); // Store ID

            System.out.print("Enter Name: ");
            students[i][1] = scanner.nextLine(); // Store Name

            System.out.print("Enter Age: ");
            students[i][2] = scanner.nextLine(); // Store Age
        }

        // Displaying student details
        System.out.println("\nStudent Details:");
        for (int i = 0; i < size; i++) {
            System.out.println("ID: " + students[i][0] + ", Name: " + students[i][1] + ", Age: " + students[i][2]);
        }

        scanner.close();
    }
}
