public class Bitwise{
    public static void main(String[] args) {
        int a = 5;   // 0101
        int b = 3;   // 0011

        System.out.println("a & b: " + (a & b));  // 0001 -> 1
        System.out.println("a | b: " + (a | b));  // 0111 -> 7
        System.out.println("a ^ b: " + (a ^ b));  // 0110 -> 6
        System.out.println("~a: " + (~a));        // Inverts bits
        System.out.println("a << 1: " + (a << 1)); // 1010 -> 10
        System.out.println("a >> 1: " + (a >> 1)); // 0010 -> 2
    }
}
