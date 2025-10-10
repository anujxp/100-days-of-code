package Question;

/*
 09_ImmutableClassExample.java
 Shows how to create a simple immutable class (no setters, final fields)
*/
final class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

}public class ImmutableClassExample{

    public static void main(String[] args) {
        System.out.println("--- 09_ImmutableClassExample ---");
        Point p = new Point(2, 3);
        System.out.println(p);
    }
}
