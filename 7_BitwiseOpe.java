
class BitwiseExample {

    public static void main(String[] args) {
        int a = 5;  // Binary: 0101
        int b = 3;  // Binary: 0011

        // Bitwise AND
        System.out.println("a & b = " + (a & b));

        // Bitwise OR
        System.out.println("a | b = " + (a | b));

        // Bitwise XOR
        System.out.println("a ^ b = " + (a ^ b));

        // Bitwise NOT
        System.out.println("~a = " + (~a));

        // Left Shift
        System.out.println("a << 2 = " + (a << 2));

        // Right Shift
        System.out.println("a >> 2 = " + (a >> 2));

        // Unsigned Right Shift
        System.out.println("a >>> 2 = " + (a >>> 2));
    }
}
