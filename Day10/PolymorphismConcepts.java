/*
 PolymorphismConcepts.java
 Day 10 — Demonstrates:
  - Method overloading (compile-time polymorphism)
  - Method overriding and runtime polymorphism
  - Upcasting (safe) and Downcasting (explicit)
  - Safe downcast check using instanceof
 Compile:
   javac PolymorphismConcepts.java
 Run:
   java PolymorphismConcepts
*/

class Printer {
    // Method overloading (compile-time polymorphism)
    public void print(String s) {
        System.out.println("Printing string: " + s);
    }

    public void print(int n) {
        System.out.println("Printing integer: " + n);
    }

    public void print(String s, int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.print(s);
            if (i < repeat - 1) System.out.print(" | ");
        }
        System.out.println();
    }
}

// Base class
class Animal {
    public void speak() {
        System.out.println("Animal makes a sound.");
    }
}

// Subclass overrides speak() — runtime polymorphism
class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Dog barks: Woof!");
    }

    public void fetch() {
        System.out.println("Dog fetches the ball.");
    }
}

class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Cat meows: Meow!");
    }

    public void purr() {
        System.out.println("Cat purrs contently.");
    }
}

class PolymorphismConcepts {
    public static void main(String[] args) {
        System.out.println("=== Compile-time polymorphism (overloading) ===");
        Printer pr = new Printer();
        pr.print("Hello");
        pr.print(2023);
        pr.print("Repeat", 3);

        System.out.println("\n=== Runtime polymorphism (overriding) & casting ===");
        // Upcasting: Dog referenced as Animal (safe)
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        // At runtime, Dog.speak() and Cat.speak() are invoked (dynamic dispatch)
        a1.speak(); // Dog's implementation
        a2.speak(); // Cat's implementation

        System.out.println("\n=== Downcasting (when you need subclass-specific methods) ===");
        // Need to downcast to call Dog-specific method fetch()
        if (a1 instanceof Dog) {
            Dog d = (Dog) a1; // explicit downcast
            d.fetch();
        }

        // Unsafe downcast example (checked with instanceof)
        if (a2 instanceof Dog) {
            Dog wrong = (Dog) a2; // this block won't run because a2 is a Cat
            wrong.fetch();
        } else {
            System.out.println("Cannot downcast a2 to Dog — it is not a Dog instance.");
        }

        System.out.println("\n=== Polymorphism tip ===");
        System.out.println("Use base-type references for flexibility; downcast only when needed and safe.");
    }
}
