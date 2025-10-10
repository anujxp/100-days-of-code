package Question;

/*
 07_ObjectCreationExample.java
 Shows different ways objects are created and references.
*/
class Box {
    int id;

    Box(int id) {
        this.id = id;
    }

    public String toString() {
        return "Box:" + id;
    }
}

public class ObjectCreationExample {
    public static void main(String[] args) {
        System.out.println("--- 07_ObjectCreationExample ---");
        Box b1 = new Box(1);
        Box b2 = b1; // reference copy
        Box b3 = new Box(3);
        System.out.println(b1 + "," + b2 + "," + b3);
        b2.id = 99;
        System.out.println("After modify b2 -> b1=" + b1);
    }
}
