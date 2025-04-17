
class One{
    public int fun(int a,int b)
    {
        return a + b;
    }
}


public class LambdaExpression {
    public static void main(String[] args) {
        One a=new One();
        int result= a.fun(5, 8);
        System.out.println(result);
    }
}
