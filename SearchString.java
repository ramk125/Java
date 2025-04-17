public class SearchString {
    public static void main(String[] args) {
        String text = "Java Programming";

        System.out.println(text.indexOf("Program"));   // ✅ 5
        System.out.println(text.indexOf("Python"));    // ❌ -1 (Not found)
        System.out.println(text.indexOf('a'));         // ✅ 1 (First 'a')


        System.out.println(text.lastIndexOf("a"));    // ✅ 10 (Last 'a')
        System.out.println(text.lastIndexOf("Java")); // ✅ 0 (First occurrence of "Java")

        System.out.println(text.contains("Java"));  // ✅ true
        System.out.println(text.contains("Python"));// ❌ false

        String text1 = "Hello, Java";

        System.out.println(text1.startsWith("Hello"));  // ✅ true
        System.out.println(text1.endsWith("Java"));     // ✅ true
        System.out.println(text1.startsWith("Java"));   // ❌ false

        System.out.println(text.matches("Java.*")); // ✅ true (Starts with Java)
        System.out.println(text.matches("\\d+"));   // ❌ false (Not only digits)
    }
}
