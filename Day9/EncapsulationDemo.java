

/*
EncapsulationExample.java
Demonstrates encapsulation: private fields, public getters/setters,
and controlled access (validation inside setter).
Run:
  javac Question/EncapsulationExample.java
  java Question.EncapsulationExample
*/

class Person {
    // private fields - encapsulated
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        setAge(age); // use setter (validation) even in constructor
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Invalid name. Keeping previous value.");
            return;
        }
        this.name = name.trim();
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be negative. Setting to 0.");
            this.age = 0;
            return;
        }
        this.age = age;
    }

    // Behaviour method
    public void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }
}

class EncapsulationDemo {
    public static void main(String[] args) {
        System.out.println("=== Encapsulation Demo ===");

        // create person
        Person p = new Person("Anuj", 21);
        p.introduce();

        // Try invalid operations via setters (encapsulation protects internal state)
        p.setName("   ");   // invalid name -> rejected
        p.setAge(-5);       // invalid age -> normalized to 0

        // Show final state
        p.introduce();

        // Update safely using setters
        p.setName("Anuj Sharma");
        p.setAge(22);
        p.introduce();
    }
}
