public class ExceptionClassNotFound {
    public static void main(String[] args) {
        try {
            // Attempting to load a class that doesn't exist
            Class<?> clazz = Class.forName("com.example.UnknownClass");
            System.out.println("Class Loaded: " + clazz.getName());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}
