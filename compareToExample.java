public class compareToExample {
    public static void main(String[] args) {
        String str1 = "Apple";
        String str2 = "Banana";
        String str3 = "Apple";

        System.out.println(str1.compareTo(str2));  // Negative (-ve) → "Apple" < "Banana"
        System.out.println(str2.compareTo(str1));  // Positive (+ve) → "Banana" > "Apple"
        System.out.println(str1.compareTo(str3));  // 0 → "Apple" == "Apple"
    }
}
