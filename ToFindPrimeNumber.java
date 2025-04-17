import java.util.Scanner;
public class ToFindPrimeNumber {
    public static void main(String args[])
    {
        int size1;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        size1=s.nextInt();
        int a[]= new int[size1];
        int i;
        for(i=0;i<size1;i++)
        {
            a[i]=i+1;
        }
 
        for(int j=0;j<size1;j++)
        {
            if(a[i]>1)
            {
                if(a[i]%2==0)
                {

                }
                else
                {
                    System.out.println("Prime "+a[i]);
                }
            }
            else
            {

            }
        }

    }
}
