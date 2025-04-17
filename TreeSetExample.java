import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // Adding elements
        numbers.add(5);
        numbers.add(1);
        numbers.add(10);
        numbers.add(3);

        System.out.println("TreeSet: " + numbers);  // Output: [1, 3, 5, 10]

        // Attempting to add duplicates
        numbers.add(5);
        System.out.println("After adding duplicate 5: " + numbers);  // Still: [1, 3, 5, 10]

        // First and last elements
        System.out.println("First: " + numbers.first());  // Output: 1
        System.out.println("Last: " + numbers.last());    // Output: 10

        // Using higher() and lower()
        System.out.println("Higher than 3: " + numbers.higher(3));  // Output: 5
        System.out.println("Lower than 3: " + numbers.lower(3));    // Output: 1

        // Removing elements
        numbers.remove(10);
        System.out.println("After removing 10: " + numbers);  // Output: [1, 3, 5]
        
        System.out.println("Contains "+numbers.contains(6));
    }
}
