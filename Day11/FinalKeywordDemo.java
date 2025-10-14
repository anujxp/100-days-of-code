// FinalKeywordDemo.java
// Illustrates final variable, final method, final class
// Run: javac FinalKeywordDemo.java && java FinalKeywordDemo

final class Utils {
    // final class cannot be extended
    public static final double PI = 3.14159; // final variable

    public static final void showVersion() { // final method (static + final)
        System.out.println("Utils version 1.0 (final method)");
    }
}

// Uncommenting the following will cause compile error because Utils is final
// class ExtendedUtils extends Utils { }

class FinalKeywordDemo {
    public static void main(String[] args) {
        System.out.println("PI = " + Utils.PI);
        Utils.showVersion();

        // final variable example: cannot reassign
        final int max = 10;
        System.out.println("Final variable max = " + max);
        // max = 20; // <-- compile error if uncommented
    }
}
