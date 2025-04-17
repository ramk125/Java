import java.util.Scanner;

public class StringAddString {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String str1=sc.nextLine();
        String str2=sc.nextLine();
        int num=sc.nextInt();

        for(int i=0;i<str1.length();i++)
        {
            if(i==num)
            {
                str1(i).append(str2);
                break;
            }
        }
        System.out.println(str1);
    }
}