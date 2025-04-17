public class AssertionExample {
    public static void main(String[] args) {
        int age = 5;

        assert age >= 18 : "Age is less than 18";  // Assertion will fail here

        System.out.println("Age is: " + age);
    }
}
