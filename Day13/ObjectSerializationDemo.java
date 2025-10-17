// ObjectSerializationDemo.java
// Demonstrates basic Java object serialization & deserialization

import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;
    Person(String n, int a) { name = n; age = a; }
    @Override public String toString() { return "Person{name='" + name + "', age=" + age + "}"; }
}

public class ObjectSerializationDemo {
    public static void main(String[] args) {
        String file = "person.ser";
        Person p = new Person("Anuj", 23);

        // serialize
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(p);
            System.out.println("Serialized: " + p);
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }

        // deserialize
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Person p2 = (Person) ois.readObject();
            System.out.println("Deserialized: " + p2);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }
}

