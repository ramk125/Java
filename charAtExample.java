public class charAtExample {
    public static void main(String[] args) {
        String str = "Java";
        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);

        System.out.println("First: " + first);  // Output: J
        System.out.println("Last: " + last);    // Output: a
    }
}
