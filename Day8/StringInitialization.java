
public class StringInitialization {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");

        System.out.println("Literal String: " + s1);
        System.out.println("New Object String: " + s2);
        System.out.println("Are they same (==)? " + (s1 == s2));
        System.out.println("Are they equal (.equals)? " + s1.equals(s2));
    }
}
