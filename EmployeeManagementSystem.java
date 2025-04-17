import java.util.*;

class Employee {
    String name, address, gender;
    int id, age;

    Employee(int id, String name, String address, int age, String gender) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = gender;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Address: " + address + ", Age: " + age + ", Gender: " + gender;
    }
}

public class EmployeeManagementSystem {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Employee> employees = new ArrayList<>();

    // Add Employee
    static void addEmployee() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Gender: ");
        String gender = sc.nextLine();
        employees.add(new Employee(id, name, address, age, gender));
        System.out.println("Employee added successfully!");
    }

    // Display Employees
    static void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee emp : employees) {
                System.out.println(emp);
            }
        }
    }

    // Update Employee
    static void updateEmployee() {
        System.out.print("Enter Employee ID to update: ");
        int id = sc.nextInt();
        for (Employee emp : employees) {
            if (emp.id == id) {
                sc.nextLine();
                System.out.print("Enter New Name: ");
                emp.name = sc.nextLine();
                System.out.print("Enter New Address: ");
                emp.address = sc.nextLine();
                System.out.print("Enter New Age: ");
                emp.age = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter New Gender: ");
                emp.gender = sc.nextLine();
                System.out.println("Employee updated successfully!");
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    // Delete Employee
    static void deleteEmployee() {
        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();
        Iterator<Employee> it = employees.iterator();
        while (it.hasNext()) {
            if (it.next().id == id) {
                it.remove();
                System.out.println("Employee deleted successfully!");
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    displayEmployees();
                    break;
                case 3:
                    updateEmployee();
                    break;
                case 4:
                    deleteEmployee();
                    break;
                case 5:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter again.");
            }
        } while (choice != 5);
    }
}
