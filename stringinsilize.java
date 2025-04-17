public class stringinsilize {
    public static void main(String[] args) {
        
        String str1 = "Hello";
        String str2 = " World";
        String result = str1 + str2; // Using `+` operator
        System.out.println(result); // Output: Hello World

        String result2 = str1.concat(str2); // Using `concat()`
        System.out.println(result2); // Output: Hello World
    }
}
