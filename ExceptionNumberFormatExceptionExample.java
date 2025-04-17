public class ExceptionNumberFormatExceptionExample {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("abc"); // Invalid number format
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred: " + e.getMessage());
        }
    }
}
