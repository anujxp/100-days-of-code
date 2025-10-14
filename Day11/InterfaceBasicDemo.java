// InterfaceBasicDemo.java
// Simple interface and implementation example
// Run: javac InterfaceBasicDemo.java && java InterfaceBasicDemo

interface Greeter {
    // contract method
    void greet(String name);
}

class EnglishGreeter implements Greeter {
    @Override
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}

class InterfaceBasicDemo {
    public static void main(String[] args) {
        Greeter g = new EnglishGreeter(); // interface reference
        g.greet("Anuj");
    }
}
