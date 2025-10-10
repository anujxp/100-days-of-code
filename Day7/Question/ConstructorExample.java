package Question;

/*
 02_ConstructorExample.java
 Demonstrates constructors, overloaded constructors, and default values.
*/
class Person {
    private String name;
    private int age;
    public Person() { this("Unknown", 0); } // default
    public Person(String name, int age) { this.name = name; this.age = age; }
    public String toString() { return name + " (" + age + ")"; }
}
public class ConstructorExample {
    public static void main(String[] args) {
        System.out.println("--- 02_ConstructorExample ---");
        Person p1 = new Person();
        Person p2 = new Person("Anuj", 21);
        System.out.println(p1);
        System.out.println(p2);
    }
}
