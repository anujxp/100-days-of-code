// InterfaceExtendsDemo.java
// Demonstrates interface inheritance (interface extends interface)
// Run: javac InterfaceExtendsDemo.java && java InterfaceExtendsDemo

interface Movable {
    void move();
}

interface Flyable extends Movable {
    void fly();
}

class Drone implements Flyable {
    @Override
    public void move() {
        System.out.println("Drone is moving to position.");
    }

    @Override
    public void fly() {
        System.out.println("Drone is flying.");
    }
}

class InterfaceExtendsDemo {
    public static void main(String[] args) {
        Flyable d = new Drone();
        d.move();
        d.fly();
    }
}
