public class Exception2 {
    public static void main(String[] args) {
        try
        {
             int[] num={10,20,30,40,60};
             int b=0;

             System.out.println("The value of the array: "+num[10]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
             System.out.println("It is not present: "+e);
        }
    }
}
