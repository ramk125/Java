import java.util.Scanner;

public class ExceptionIllegalStateExceptionExample {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            scanner.close(); // Scanner is closed
            scanner.nextInt(); // Trying to read input after closing scanner
        } catch (IllegalStateException e) {
            System.out.println("IllegalStateException occurred: " + e.getMessage());
        }
    }
}
