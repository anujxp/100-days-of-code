package Question;

/*
 11_FactoryPatternExample.java
 Simple factory pattern to show a creational pattern using OOP.
*/
interface Animal {
    void speak();
}

class Cat implements Animal {
    public void speak() {
        System.out.println("Meow");
    }
}

class DogA implements Animal {
    public void speak() {
        System.out.println("Woof");
    }
}

class AnimalFactory {
    public static Animal create(String type) {
        if ("cat".equalsIgnoreCase(type))
            return new Cat();
        if ("dog".equalsIgnoreCase(type))
            return new DogA();
        return null;
    }

}public classFactoryPatternExample{

    public static void main(String[] args) {
        System.out.println("--- 11_FactoryPatternExample ---");
        Animal a1 = AnimalFactory.create("cat");
        Animal a2 = AnimalFactory.create("dog");
        a1.speak(); a2.speak();
    }
}
