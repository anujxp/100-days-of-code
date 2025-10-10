package Question;

/*
 08_CompositionExample.java
 Composition: objects own other objects (has-a relationship)
*/
class Engine {
    private String type;

    Engine(String t) {
        type = t;
    }

    public String toString() {
        return type;
    }
}

class VehicleC {
    private String model;
    private Engine engine;

    public VehicleC(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public String toString() {
        return model + " with engine " + engine;
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        System.out.println("--- 08_CompositionExample ---");
        Engine e = new Engine("V6");
        VehicleC v = new VehicleC("Mustang", e);
        System.out.println(v);
    }
}
