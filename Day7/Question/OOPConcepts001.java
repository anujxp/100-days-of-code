package Question;

/*
 01_OOPConcepts.java
 Short demo consolidating Class/Object, Constructor, Encapsulation, Inheritance, Polymorphism, Abstraction.
*/

interface Drivable { void drive(); }

class Vehicle {
    private String brand;
    public Vehicle(String brand) { this.brand = brand; }
    public String getBrand() { return brand; }
    public void drive() { System.out.println("Vehicle driving (generic)."); }
}

class Car extends Vehicle {
    private String model;
    public Car(String brand, String model) { super(brand); this.model = model; }
    @Override
    public void drive() { System.out.println(getBrand() + " " + model + " drives smoothly."); }
}

public class OOPConcepts001{
    public static void main(String[] args) {
        System.out.println("--- 01_OOPConcepts ---");
        Vehicle v = new Vehicle("GenericCo");
        v.drive();
        Car c = new Car("Toyota","Corolla");
        c.drive();
        Vehicle p = new Car("Honda","Civic");
        p.drive(); // polymorphism
    }
}
