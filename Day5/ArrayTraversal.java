// Example: Traversing an array using for loop and enhanced for loop

public class ArrayTraversal {
    public static void main(String[] args) {
        String[] names = {"Anuj", "Rahul", "Priya", "Simran"};

        System.out.println("Using traditional for loop:");
        for (int i = 0; i < names.length; i++) {
            System.out.println("names[" + i + "] = " + names[i]);
        }

        System.out.println("\nUsing enhanced for loop:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}