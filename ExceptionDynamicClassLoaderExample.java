public class ExceptionDynamicClassLoaderExample {
    public static void main(String[] args) {
        String className = "java.util.ArrayList"; // Try changing this to a non-existent class
        
        try {
            // Dynamically load the class
            Class<?> clazz = Class.forName(className);
            System.out.println("Class loaded: " + clazz.getName());
            
            // Create an instance of the loaded class
            Object obj = clazz.getDeclaredConstructor().newInstance();
            System.out.println("Instance created: " + obj.getClass().getSimpleName());
        
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        } catch (InstantiationException | IllegalAccessException e) {
            System.out.println("Cannot create an instance of the class: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            System.out.println("Execution complete.");
        }
    }
}
