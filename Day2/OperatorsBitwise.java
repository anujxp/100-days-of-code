// OperatorsBitwise.java
// Bitwise operators and simple demonstration

public class OperatorsBitwise {
    public static void main(String[] args) {
        int p = 6;  // 0110
        int q = 3;  // 0011

        System.out.println("p & q = " + (p & q));   // 0010 => 2
        System.out.println("p | q = " + (p | q));   // 0111 => 7
        System.out.println("p ^ q = " + (p ^ q));   // 0101 => 5
        System.out.println("~p = " + (~p));         // bitwise complement
        System.out.println("p << 1 = " + (p << 1)); // left shift => 12
        System.out.println("p >> 1 = " + (p >> 1)); // right shift => 3
    }
}
