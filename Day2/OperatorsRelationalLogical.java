// OperatorsRelationalLogical.java
// Relational operators and logical operators examples

public class OperatorsRelationalLogical {
    public static void main(String[] args) {
        int x = 7, y = 10;

        // relational
        System.out.println("x == y? " + (x == y));
        System.out.println("x != y? " + (x != y));
        System.out.println("x > y? " + (x > y));
        System.out.println("x <= y? " + (x <= y));

        // logical
        boolean cond1 = (x < y);    // true
        boolean cond2 = (x % 2 == 0); // false

        System.out.println("cond1 && cond2 = " + (cond1 && cond2));
        System.out.println("cond1 || cond2 = " + (cond1 || cond2));
        System.out.println("!cond2 = " + (!cond2));
    }
}

