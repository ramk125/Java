import java.util.Arrays;

public class SortString {
    
    static boolean areAnagrams(String s1, String s2) {
        // If lengths are different, they cannot be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert strings to char arrays
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        // Sort the arrays
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        // Compare sorted arrays
        return Arrays.equals(s1Array, s2Array);
    }

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "olleh";

        if (areAnagrams(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams.");
        }
    }
}
