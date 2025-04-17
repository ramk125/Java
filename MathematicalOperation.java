import java.io.*;
public class MathematicalOperation {
    public static void main(String[] args) {
        int a=10,b=20;
        double d;
        d=Math.min(a, b);
        System.out.println("Minimum: "+d);
        d=Math.max(a, b);
        System.out.println("Meximum: "+d);
        d=Math.pow(a, b);
        System.out.println("Power of : "+d);
        d=Math.sqrt(a);
        System.out.println("Square is : "+d);
        d=Math.log(a);
        System.out.println("Log of a is : "+d);
        d=Math.abs(b);
        System.out.println("Absolute b is: "+d);


    }
}
