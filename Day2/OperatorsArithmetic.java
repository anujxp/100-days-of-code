// OperatorsArithmetic.java
// Basic arithmetic operators and precedence

public class OperatorsArithmetic {
    public static void main(String[] args) {
        int a = 10, b = 3;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b (integer) = " + (a / b)); // integer division
        System.out.println("a / (double)b = " + (a / (double)b)); // float division
        System.out.println("a % b = " + (a % b)); // remainder

        // precedence
        System.out.println("2 + 3 * 4 = " + (2 + 3 * 4)); // 14
        System.out.println("(2 + 3) * 4 = " + ((2 + 3) * 4)); // 20
    }
}

