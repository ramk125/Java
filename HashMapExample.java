import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store student IDs and names
        HashMap<Integer, String> students = new HashMap<>();

        // Adding key-value pairs
        students.put(101, "Ram");
        students.put(102, "Shyam");
        students.put(103, "Mohan");

        // Displaying the map
        System.out.println("Student HashMap: " + students);

        // Access a value by key
        System.out.println("Student with ID 102: " + students.get(102));

        // Remove a key-value pair
        students.remove(101);

        // Check if a key exists
        System.out.println("Contains key 101? " + students.containsKey(101));

        // Check if a value exists
        System.out.println("Contains value 'Mohan'? " + students.containsValue("Mohan"));

        // Size of the HashMap
        System.out.println("Size of HashMap: " + students.size());

        // Looping through the map
        System.out.println("\n=== All Students ===");
        for (Integer id : students.keySet()) {
            System.out.println("ID: " + id + ", Name: " + students.get(id));
        }
    }
}
