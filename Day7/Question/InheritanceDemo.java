package Question;

/*
 04_InheritanceDemo.java
 Shows single inheritance and using super to call parent constructor/methods.
*/
class Animal {
    protected String name;
    public Animal(String name) { this.name = name; }
    public void speak() { System.out.println(name + " makes a sound."); }
}
class Dog extends Animal {
    public Dog(String name) { super(name); }
    @Override public void speak() { System.out.println(name + " barks."); }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("--- 04_InheritanceDemo ---");
        Animal a = new Animal("Creature"); a.speak();
        Dog d = new Dog("Rex"); d.speak();
    }
}
