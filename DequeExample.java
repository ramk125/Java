import java.util.*;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Add elements at both ends
        deque.addFirst("Ram");
        deque.addLast("Shyam");
        deque.offerFirst("Mohan");
        deque.offerLast("Gopal");

        // Display Deque
        System.out.println("Deque: " + deque);

        // Access elements
        System.out.println("First Element: " + deque.getFirst());
        System.out.println("Last Element: " + deque.getLast());

        // Remove elements from both ends
        System.out.println("Removed First: " + deque.removeFirst());
        System.out.println("Removed Last: " + deque.removeLast());

        // Check contents
        System.out.println("Contains 'Ram'? " + deque.contains("Ram"));

        // Final state
        System.out.println("Final Deque: " + deque);
    }
}
