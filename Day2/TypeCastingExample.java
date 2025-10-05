// TypeCastingExample.java
// Implicit (widening) and explicit (narrowing) casting

public class TypeCastingExample {
    public static void main(String[] args) {
        // widening (implicit)
        int i = 100;
        double d = i; // int -> double
        System.out.println("Widening: int 100 -> double " + d);

        // narrowing (explicit)
        double x = 9.78;
        int y = (int) x; // fractional part lost
        System.out.println("Narrowing: double 9.78 -> int " + y);

        // casting can cause overflow/loss
        long large = 5_000_000_000L;
        int small = (int) large; // overflow
        System.out.println("Casting long 5000000000L -> int = " + small);
    }
}
