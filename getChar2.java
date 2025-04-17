public class getChar2 {
    public static void main(String[] args) {
        String str = "Java Programming";
        char[] arr = new char[12];  // Increased size

        str.getChars(5, 15, arr, 2);  // Copy "Programming" into arr starting at index 2

        System.out.println(arr);  // Output: "  Programming" (2 blank spaces at start)
    }
}
