abstract class Figure{
    double dim1;
    double dim2;
    Figure(double a,double b)
    {
        dim1=a;
        dim2=b;
    }
    abstract double area();
}
class Rectangle extends Figure
{
    Rectangle(double a, double b)
    {
        super(a,b);
    }
    double area()
    {
        System.out.println("Inside area for Rectangle.");
        return dim1*dim2;
    }
}
class Triangle extends Figure
{
    Triangle(double a,double b)
    {
        super(a,b);
    }
    double area()
    {
        System.out.println("Inside area for Triangle.");
        return dim1*dim2/2;
    }
}

public class AbstractFromBook {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(10,10 );
        Triangle t=new Triangle(9, 5);
        Figure f;
        f=r;
        System.out.println("Area is "+f.area());
        
        f=t;
        System.out.println("Area is "+f.area());
    }
}
