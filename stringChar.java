import java.util.Arrays;
import java.util.Scanner;
public class stringChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sting");
        String str=sc.nextLine();

        char[] ch=str.toCharArray();
        String str1=new String(ch);
        String str2=new String(ch,2,5);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(Arrays.toString(ch));
    }
}
