abstract class Area
{
    abstract void area();
}
class Circle extends Area
{
    void area()
    {
        double r=12.44,A,pi=3.14;
        A=pi*r*r;
        System.out.println("Area is:"+A);
    }
}
class Ract extends Area
{
    void area()
    {
        double l=10.5,w=20.4,A;
        A=l*w;
        System.out.println("Area of RACT is: "+A);
    }
}
class TestAbstract
{
    public static void main(String args[])
    {
        Area A=new Circle();
        A.area();
    }
}