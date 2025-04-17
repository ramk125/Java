public class StringFunction {
    public static void main(String[] args) {
        String str = "welcome to ram kumar";
        String str1="Hello";

        System.out.println("Length " + str.length());
        for (int i = 0; i < str.length(); i++) {
            System.out.println("Index " + i + ": " + str.charAt(i));
        }

        char ch = str.charAt(5);
        System.out.println("Character at index 5: " + ch);

        System.out.println(str.substring(3, 8));
        
        System.out.println(str.concat("Araria"));

        System.out.println(str.indexOf("ram"));
        System.out.println(str.indexOf("e",3));

        System.out.println(str1.equals("Hello"));

        String str3 = "Apple";
        String str4 = "Banana";
        String str5 = "Apple";

        System.out.println(str3.compareTo(str4)); // Negative (Apple < Banana)
        System.out.println(str4.compareTo(str3)); // Positive (Banana > Apple)
        System.out.println(str3.compareTo(str5)); // 0 (Both are equal)

        System.out.println(str3.toLowerCase());
        System.out.println(str3.toUpperCase());

        String str6 = "   Hello, World!   ";
        System.out.println("Before trim: [" + str6 + "]");
        
        String trimmedStr = str6.trim();
        System.out.println("After trim: [" + trimmedStr + "]");

        System.out.println(str.replace("r", "R"));

        String str7 = "Java is fun. Java is powerful.";
        String newStr = str7.replaceAll("Java", "Python");
        System.out.println(newStr);
    }
}
