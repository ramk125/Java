
import java.util.*;
import java.util.ArrayList;

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("ID : " + id + " Name : " + name + " Age : " + age);
    }
}

class SM {
    ArrayList<Student> st = new ArrayList<>();

    public void insert(Student student) {
        st.add(student);
        System.out.println("Student added successfully");
    }

    public void delete(int idd) {
        boolean fount = false;
        for (int i = 0; i < st.size(); i++) {
            if (st.get(i).id == idd) {
                st.remove(i);
                System.out.println("Student remove successfully " + idd);
                fount = true;
            }
        }
        if (!fount) {
            System.out.println("Student not present");
        }
    }

    public void displayAll() {
        for (Student s : st) {
            s.display();
        }
    }
    public void update(int uid,String uname,int uage)
    {
        boolean found=false;
        for(Student s:st)
        {
            if(s.id==uid)
            {
                s.name=uname;
                s.age=uage;
                found=true;
                System.out.println("Update successfully");
            }
        }
        if(!found)
        {
            System.out.println("ID not fount");
        }
    }

}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SM sm = new SM();

        System.out.println("1-Insert, 2-delte, 3-display, 5-exit");

        while (true) {

            System.out.println("Enter your choice ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Id Name and age of student");
                    int ide = sc.nextInt();
                    sc.nextLine();
                    String str = sc.nextLine();
                    int ag = sc.nextInt();
                    sc.nextLine();
                    sm.insert(new Student(ide, str, ag));
                    break;
                case 2:
                    System.out.println("Enter id your want to delete");
                    int did = sc.nextInt();
                    sc.nextLine();
                    sm.delete(did);
                    break;
                case 3:
                    sm.displayAll();
                case 4:
                    System.out.println("Enter id");
                    int nid=sc.nextInt();
                    sc.nextLine();
                    String nname=sc.nextLine();
                    int nage=sc.nextInt();
                    sc.nextLine();
                    sm.update(nid, nname, nage);
                    break;
                case 5:
                    return;
                   // break;
                default:
                    break;
            }

        }

    }
}
