/*
CastingSafetyDemo.java
Demonstrates upcasting and downcasting with safety checks (instanceof).
Compile:
  javac CastingSafetyDemo.java
Run:
  java CastingSafetyDemo
*/

class Parent {
    public void greet() { System.out.println("Hello from Parent"); }
}

class Child extends Parent {
    public void special() { System.out.println("Child special method"); }
}

class CastingSafetyDemo {
    public static void main(String[] args) {
        System.out.println("=== Casting Safety Demo ===");

        // Upcasting (implicit, safe)
        Parent p = new Child(); // upcast
        p.greet(); // at runtime, if overridden, subclass method runs

        // Downcasting (requires explicit cast)
        if (p instanceof Child) {
            Child c = (Child) p;
            c.special(); // safe to call
        } else {
            System.out.println("p is NOT a Child, cannot downcast safely");
        }

        // Unsafe example: parent reference that is not pointing to Child
        Parent p2 = new Parent();
        if (p2 instanceof Child) {
            Child c2 = (Child) p2;
            c2.special();
        } else {
            System.out.println("p2 is not a Child; downcast avoided");
        }
    }
}
