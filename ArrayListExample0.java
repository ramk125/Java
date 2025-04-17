import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample0 {
    public static void main(String[] args) {
        
        // 1️⃣ Create an ArrayList
        ArrayList<String> students = new ArrayList<>();

        // 2️⃣ Add elements
        students.add("Ram");
        students.add("Shyam");
        students.add("Sita");
        students.add("Geeta");

        System.out.println("Original List: " + students);

        // 3️⃣ Access elements
        System.out.println("First Student: " + students.get(0));

        // 4️⃣ Update an element
        students.set(1, "Radha");
        System.out.println("After Update: " + students);

        // 5️⃣ Remove an element
        students.remove("Geeta");
        System.out.println("After Removal: " + students);

        // 6️⃣ Check for an element
        System.out.println("Contains Sita? " + students.contains("Sita"));

        // 7️⃣ Get the size of the list
        System.out.println("Size of List: " + students.size());

        // 8️⃣ Sort the list
        Collections.sort(students);
        System.out.println("Sorted List: " + students);

        // 9️⃣ Iterate using a for-each loop
        System.out.println("Students using for-each loop:");
        for (String student : students) {
            System.out.println(student);
        }

        // 🔟 Iterate using an Iterator
        System.out.println("Students using Iterator:");
        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 1️⃣1️⃣ Clear the list
        students.clear();
        System.out.println("After Clearing: " + students);

        // 1️⃣2️⃣ Check if the list is empty
        System.out.println("Is list empty? " + students.isEmpty());
    }
}
