// DataTypesExample.java
// Demonstrates primitive types and their typical ranges (comments)

public class DataTypesExample {
    public static void main(String[] args) {
        byte b = 100;              // -128 to 127
        short s = 32000;           // -32,768 to 32,767
        int i = 2_000_000_000;     // ~ ±2.1 billion
        long l = 9_000_000_000L;   // suffix L for long
        float f = 3.14f;           // single precision (suffix f)
        double d = 3.1415926535;   // double precision
        char c = 'J';
        boolean bool = false;

        System.out.println("byte b = " + b);
        System.out.println("short s = " + s);
        System.out.println("int i = " + i);
        System.out.println("long l = " + l);
        System.out.println("float f = " + f);
        System.out.println("double d = " + d);
        System.out.println("char c = " + c);
        System.out.println("boolean bool = " + bool);

        // Integer overflow example
        int max = Integer.MAX_VALUE;
        System.out.println("Integer.MAX_VALUE = " + max);
        System.out.println("Overflow example: MAX + 1 = " + (max + 1));
    }
}
