public class ExceptionMultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = numbers[5] / 0; // This triggers an exception
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());

        } catch (Exception e) {  
            System.out.println("Some other exception caught: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
