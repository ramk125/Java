public class ExceptionMultipleTryExample {
    public static void main(String[] args) {
        try {
            // Outer try block
            System.out.println("Outer try block starts.");

            int[] numbers = {10, 20, 30};
            System.out.println("Accessing element: " + numbers[2]);

            // First inner try block
            try {
                int result = numbers[1] / 0; // This causes ArithmeticException
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Inner try 1: Cannot divide by zero.");
            }

            // Second inner try block
            try {
                String str = null;
                System.out.println(str.length()); // This causes NullPointerException
            } catch (NullPointerException e) {
                System.out.println("Inner try 2: Null pointer detected.");
            }

            System.out.println("Outer try block ends successfully.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer try block: Array index out of bounds!");

        } catch (Exception e) {
            System.out.println("Outer try block: An unexpected error occurred: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
