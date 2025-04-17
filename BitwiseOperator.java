public class BitwiseOperator {
    public static void main(String[] args) {
        int a = 5, b = 3; // a = 0101, b = 0011 in binary
        System.out.println(a & b); // Bitwise AND (result: 1)
        System.out.println(a | b); // Bitwise OR (result: 7)
        System.out.println(a ^ b); // Bitwise XOR (result: 6)
        System.out.println(~a); // Bitwise NOT (result: -6)
        System.out.println(a << 1); // Left shift (result: 10)
        System.out.println(a >> 1); // Right shift (result: 2)

    }

}
