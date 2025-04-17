public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Welcome");

        sb.append(" to Java!"); // Append text
        System.out.println(sb);
        sb.insert(7, " all"); // Insert text
        System.out.println(sb);
        sb.replace(11, 15, "Java Programming"); // Replace text
        System.out.println(sb);
        sb.delete(7, 11); // Delete text
        System.out.println(sb);
        sb.reverse(); // Reverse string

        System.out.println(sb); // Output: !gnimmargorP avaJ emocleW

        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.ensureCapacity(500);
        System.out.println(sb.capacity());

        System.out.println(sb.deleteCharAt(5));
    }
}
