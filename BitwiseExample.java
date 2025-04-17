public class BitwiseExample {

    public static void main(String[] args) {
        int a = 5;  // Binary: 0101
        int b = 3;  // Binary: 0011

        // Bitwise AND
        System.out.println("a & b = " + (a & b)); // 0101 & 0011 = 0001 => 1

        // Bitwise OR
        System.out.println("a | b = " + (a | b)); // 0101 | 0011 = 0111 => 7

        // Bitwise XOR
        System.out.println("a ^ b = " + (a ^ b)); // 0101 ^ 0011 = 0110 => 6

        // Bitwise NOT
        System.out.println("~a = " + ~a); // ~0101 => 1010 (2's complement of -6)

        // Left Shift
        System.out.println("a << 1 = " + (a << 1)); // 0101 << 1 => 1010 => 10

        // Right Shift
        System.out.println("a >> 1 = " + (a >> 1)); // 0101 >> 1 => 0010 => 2

        // Unsigned Right Shift
        int c = -5;
        System.out.println("c >>> 1 = " + (c >>> 1)); // Unsigned shift fills with 0s
        
        // Bit Masking (example use case)
        int mask = 0b0001;  // Binary mask: 0001
        System.out.println("Check if the last bit of a is set: " + ((a & mask) != 0));

        // Bit Swapping (tricky example)
        System.out.println("\nBefore Swap: a = " + a + ", b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}
