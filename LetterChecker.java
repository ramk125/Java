import java.util.*;

public class LetterChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = sc.nextLine().toLowerCase();

        System.out.print("Enter second string: ");
        String second = sc.nextLine().toLowerCase();

        boolean allPresent = true;

        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);
            if (!second.contains(String.valueOf(ch))) {
                allPresent = false;
                break;
            }
        }

        if (allPresent) {
            System.out.println("All letters of first string are present in second string.");
        } else {
            System.out.println("Not all letters of first string are present in second string.");
        }

        sc.close();
    }
}
