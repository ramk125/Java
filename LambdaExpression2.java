import java.util.ArrayList;

public class LambdaExpression2 {
    public static void main(String[] args) { 
        // Create an ArrayList of Integers
        ArrayList<Integer> numbers = new ArrayList<Integer>(); 

        // Add elements to the list
        numbers.add(5); 
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        // Use lambda expression to iterate through each element
        numbers.forEach((n) -> { 
            System.out.println(n);
        });
    } 
}
