public class InitializerBlockStatic {
    static String dbUrl;

    // Static Block
    static {
        dbUrl = "jdbc:mysql://localhost:3306/mydb";
        System.out.println("Database URL Initialized: " + dbUrl);
    }

    public static void main(String[] args) {
        System.out.println("Database URL: " + dbUrl);
    }
}
