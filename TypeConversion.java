public class TypeConversion {
        public static void main(String[] args) {
            char ch = 'A';  // Unicode value of 'A' is 65
            int num = ch;   // Implicit casting (char → int)
    
            System.out.println("Char value: " + ch);
            System.out.println("Converted to int: " + num);

            double d = 99.99;
            int n = (int) d;  // Explicitly cast double to int
    
            System.out.println("Double value: " + d);
            System.out.println("Converted to int: " + n);
        
    }
    
}
