import java.util.Scanner;

public class ExceptionCombine {
    public static void main(String[] args) {
        // try {
        //     int[] num = {10, 20, 30, 40};
        //     int a,b;

        //     Scanner sc=new Scanner(System.in);
        //     System.out.println("Whst you want to do 1 for dividing and 2 for index value printing");
        //     a=sc.nextInt();

        //     switch (a) {
        //         case 1:
        //             System.out.println("Which number you want to divide");
        //             b=sc.nextInt();
        //             System.out.println("Result "+num[1]/b);
        //             break;
        //             case 2:
        //             System.out.println("Which index value you want to print");
        //             b=sc.nextInt();
        //             System.out.println("The value is "+num[b]);
        //             break;
            
        //         default:
        //             break;
        //     }

        // } catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println("Array index out of bounds! " + e);
        // } catch (ArithmeticException e) {
        //     System.out.println("It is not divisible! " + e);
        // }
        int[] arr={10,20,30,40,50};

   try{
        for(int i=1;i<=5;i++)
        {
            int b;
            Scanner sc=new Scanner(System.in);
            b=sc.nextInt();

            System.out.println(arr[i]/b);
        }
    }
    catch(ArithmeticException e)
    {
        System.out.println("It is not divisible by "+e);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Out of boud: "+e);
    }
    }
}
