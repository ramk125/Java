public class WrapperMethods {
    public static void main(String[] args) {
        String str = "123";
        int num = Integer.parseInt(str); // Convert String to int
        System.out.println("Converted int: " + num);

        int num1 = 5;
        Integer obj = num1; // Autoboxing (int → Integer)

        System.out.println("Primitive: " + num1);
        System.out.println("Wrapper: " + obj);

        Integer obj1 = 20;
        int num2 = obj1; // Unboxing (Integer → int)

        System.out.println("Wrapper: " + obj1);
        System.out.println("Primitive: " + num2);
    }
}
