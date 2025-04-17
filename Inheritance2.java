class Base
{
   protected void print()
    {
        System.out.println("Base class");
    }
}
class Drived extends Base
{
    @Override
    public void print()
    {
        super.print();
        System.out.println("Derived");
    }
}
public class Inheritance2 {
    public static void main(String[] args) {
        Base b=new Base();
      //  b.print();
        Drived d=new Drived();
        d.print();
    }
}
