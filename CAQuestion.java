import java.util.*;

enum Department {
    A, B, C, D;
}

class Patient {
    static int count = 1;
    int ID = 1;
    String Name;
    int Age;
    String Diesease;
    String department;

    public Patient(String Name, int Age, String Diesease, Department department) {
        this.ID = count++;
        this.Name = Name;
        this.Age = Age;
        this.Diesease = Diesease;
        this.department = department.toString();
    }

    public void display() {
        System.out.println("ID: " + ID + " | Name: " + Name + " | Age: " + Age + " | Disease: " + Diesease
                + " | Department: " + department);
    }
}

class PatientRecord {
    ArrayList<Patient> patient = new ArrayList<>();

    public void AddPatient(Patient pat) {
        patient.add(pat);
        System.out.println("Patient add successfully");
    }

    public void delete(int idd) {
        boolean found = false;
        for (int i = 0; i < patient.size(); i++) {
            if (patient.get(i).ID == idd) {
                patient.remove(i);
                found = true;
                System.out.println("Patient delete successfully");
            }
        }
        if (!found) {
            System.out.println("Patient not found");
        }
    }

    public void DisplayAll() {
        for (Patient p : patient) {
            p.display();
        }
    }

    public void Update(int i, String n, int a, String ds, Department dp) {
        for (Patient up : patient) {
            if (up.ID == i) {
                up.Name = n;
                up.Age = a;
                up.Diesease = ds;
                up.department = dp.toString();
                System.out.println("Patient updated successfully");
            }
        }
    }

}

public class CAQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PatientRecord ptr = new PatientRecord();

        while (true) {
            System.out.println("\nEnter your choice: ");
            System.out.println("Add: 1, Delete: 2, Display: 3, Update: 4 Exit: 5");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter disese name: ");
                    String dis = sc.nextLine();
                    Department[] deps = Department.values();
                    for (int i = 0; i < deps.length; i++) {
                        System.out.println((i + 1) + ": " + deps[i]);
                    }
                    int dpmchoice;
                    while (true) {
                        System.out.print("Select your department (1-" + deps.length + "): ");
                        dpmchoice = sc.nextInt();
                        if (dpmchoice >= 1 && dpmchoice <= deps.length)
                            break;
                        System.out.println("❌ Invalid choice. Try again.");
                    }
                    sc.nextLine(); // consume newline
                    Department depm = deps[dpmchoice - 1];
                    ptr.AddPatient(new Patient(name, age, dis, depm));
                    break;
                case 2:
                    System.out.println("Enter ID you want to delete");
                    int did = sc.nextInt();
                    sc.nextLine();
                    ptr.delete(did);
                    break;
                case 3:
                    System.out.println("Display all the records");
                    ptr.DisplayAll();
                    break;
                case 4:
                    System.out.println("Enter ID you want to update");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter new Name: ");
                    String uname = sc.nextLine();
                    System.out.println("Enter new age: ");
                    int uage = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter new Disease: ");
                    String udis = sc.nextLine();
                    Department[] udeps = Department.values();
                    for (int i = 0; i < udeps.length; i++) {
                        System.out.println((i + 1) + ": " + udeps[i]);
                        // System.out.println((i + 1) + ": " + depts[i]);

                    }
                    int udpmchoice;
                    while (true) {
                        System.out.println("Select your choice form: 1-" + udeps.length);
                        udpmchoice = sc.nextInt();
                        if (udpmchoice >= 1 && udpmchoice <= udeps.length)
                            break;
                        System.out.println("Enter valid choice: Try again?");
                        sc.nextLine();
                    }
                    Department udepm = udeps[udpmchoice - 1];
                    ptr.Update(uid, uname, uage, udis, udepm);
                    break;
                case 5:
                    return;

                default:
                    break;
            }
        }

    }

}
