package objects;

public class ObjectCreationExample {
    public static void main(String[] args) {
        Student s1 = new Student("Anuj", 20);
        Student s2 = new Student("Riya", 22);

        s1.displayInfo();
        s2.displayInfo();
    }
}
