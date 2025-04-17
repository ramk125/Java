import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionInputMismatchExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt(); // User enters a non-integer value
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException occurred: " + e.getMessage());
        }
    }
}
