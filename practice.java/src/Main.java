class Class1 {
    String name;
    int id;

    public void getdata(String uname, int uid)
    {
        name =uname;
        id = uid;
    }
    public void display()
    {
        System.out.println("Name: "+name +"Id: "+ id);
    }
}

class Class2{
    public static void main(String args[])
    {
        Class1 cl=new Class1();
        cl.getdata("ram", 5);
        cl.display();
    }

}