

/*
InheritanceExample.java
Demonstrates inheritance (extends), overriding, and use of super().
Run:
  javac Question/InheritanceExample.java
  java Question.InheritanceExample
*/

class Vehicle {
    private String brand;
    public Vehicle(String brand) {
        this.brand = brand;
    }
    public void start() {
        System.out.println(brand + " vehicle starting.");
    }
    public void stop() {
        System.out.println(brand + " vehicle stopping.");
    }
    public String getBrand() {
        return brand;
    }
}

class Car extends Vehicle {
    private String model;
    public Car(String brand, String model) {
        super(brand);     // call to Vehicle constructor
        this.model = model;
    }

    // Car-specific method
    public void openTrunk() {
        System.out.println(getBrand() + " " + model + " trunk opened.");
    }

    // Override start() to provide car-specific behavior
    @Override
    public void start() {
        System.out.println(getBrand() + " " + model + " engine roars to life!");
    }
}

class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== Inheritance Demo ===");

        Vehicle v = new Vehicle("GenericCo");
        v.start();
        v.stop();

        System.out.println();

        Car myCar = new Car("Toyota", "Corolla");
        myCar.start();      // overridden
        myCar.openTrunk();  // car-specific
        myCar.stop();       // inherited

        System.out.println();

        // Polymorphism (Vehicle reference to Car instance)
        Vehicle poly = new Car("Honda", "Civic");
        poly.start(); // runs Car.start() because of runtime dispatch
        // poly.openTrunk(); // NOT allowed at compile-time (Vehicle type)
    }
}
