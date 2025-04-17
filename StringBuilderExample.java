public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // Append text
        sb.append(" World");
        System.out.println("After append: " + sb);  // Output: Hello World

        // Insert text
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);  // Output: Hello Java World

        // Replace text
        sb.replace(6, 10, "Python");
        System.out.println("After replace: " + sb);  // Output: Hello Python World

        // Delete text
        sb.delete(6, 13);
        System.out.println("After delete: " + sb);  // Output: Hello World

        // Reverse string
        sb.reverse();
        System.out.println("After reverse: " + sb);  // Output: dlroW olleH
    }
}
