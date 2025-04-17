import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class StringByteConcatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        byte[] byteArray = str.getBytes(); // Convert string to byte array
        
        String str1 = "ram"; 
        byte[] byteArray1 = str1.getBytes(); // Convert "ram" to byte array

        // Convert byte arrays back to string for concatenation
        String concatenatedString = new String(byteArray) + new String(byteArray1);

        System.out.println("Concatenated string: " + concatenatedString);

        System.out.println("Enter string again");
        String str2=sc.nextLine();
        byte[] bytestr=str2.getBytes();
        String s3=new String(bytestr,2,6);
        System.out.println(s3);
        String s4=new String(bytestr,4,9,StandardCharsets.US_ASCII);
        System.out.println(s4);
        
        sc.close();
    }
}
