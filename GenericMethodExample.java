public class GenericMethodExample {

    // Generic method
    public static <T> void printElement(T element) {
        System.out.println("Element: " + element);
    }

    public static void main(String[] args) {
        printElement(100);                 // Integer
        printElement("Hello, Generics!");   // String
        printElement(3.14);                 // Double
        printElement(true);                 // Boolean
    }
}
