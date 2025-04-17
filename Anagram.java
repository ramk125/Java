//import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public Boolean fun(String a,String b)
    {
        char[] x=a.toCharArray();
        char[] y=b.toCharArray();
        Arrays.sort(y);
        Arrays.sort(x);

        return (Arrays.equals(x,y));
    }
 public static void main(String[] args) {
    String s=new String("heart");
    String t=new String("earth");
    String g="hello";
    Anagram x=new Anagram();
    if(x.fun(s,g))
    {
        System.out.println("Anagram");
    }
    else
    {
        System.out.println("Not a anagram");
    }
 }   
}
