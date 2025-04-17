public class getByteExample {
    public static void main(String[] args) {
        String str = "Hello";
        byte[] byteArray = str.getBytes();

        // Print byte values
        for (byte b : byteArray) {
            System.out.print(b + " ");  
        }
    }
}
