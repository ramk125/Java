import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        v.add("Apple");
        v.add("Banana");
        v.add("Cherry");
        v.add(1, "Mango");  // Insert "Mango" at index 1

        System.out.println(v); // [Apple, Mango, Banana, Cherry]

        System.out.println(v.get(1));  // Mango
System.out.println(v.firstElement());  // Apple
System.out.println(v.lastElement());  // Cherry

System.out.println("Size: " + v.size());  // 3
System.out.println("Capacity: " + v.capacity());  // 10 (default)
System.out.println(v.contains("Banana"));  // true
System.out.println(v.isEmpty());  // false

v.remove(1);  // Removes "Mango"
v.remove("Cherry");  // Removes "Cherry"
//v.clear();  // Removes all elements

    }
}
