import java.util.Scanner;

public class BookReadingDataFromKeyboard {
    public static void main(String args[])
    {
      Scanner s= new Scanner((System.in));
      int intNumber=0;
      float floatNumber=0.0f;
      try{
        System.out.println("Enter an Inters : ");
        intNumber=s.nextInt();
        System.out.println(("Enter a float number :"));
        floatNumber=s.nextFloat();

      }
      catch (Exception e){
        System.out.println("intNumber = "+ intNumber);
        System.out.println("floatNumber = "+floatNumber);

      }
    }
}
