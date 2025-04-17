 class vara{
    void fun(int...num)
    {
        for(int nu:num)
        {
            System.out.println(nu);
        }
    }
}

public class varargs {
    public static void main(String[] args) {
        vara v=new vara();
        v.fun(12,45,67,86,86);

        
    }
}
