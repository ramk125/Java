import java.util.Scanner;
import java.util.ArrayList;

class student{
    String name;
    int id;
    public student(String n,int i)
    {
        this.name=n;
        this.id=i;
    }
    void display()
    {
        System.out.println("Name: "+name+" | ID: "+id);
    }
}

public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList <student> st=new ArrayList<>();

        System.out.println("Enter the size");
        int size=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<size;i++)
        {
          System.out.println("Enter Name and ID");
          String nm=sc.nextLine();
          int ID=sc.nextInt();
          sc.nextLine();

          st.add(new student(nm, ID));
        }

        for(int i=0;i<size;i++)
        {
            st.get(i).display();
        }
    }
}
