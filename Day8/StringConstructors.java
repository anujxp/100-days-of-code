

public class StringConstructors {
    public static void main(String[] args) {
        String s1 = new String();
        String s2 = new String("Java");
        char[] arr = {'H', 'e', 'l', 'l', 'o'};
        String s3 = new String(arr);

        System.out.println("Empty String: '" + s1 + "'");
        System.out.println("String with text: " + s2);
        System.out.println("From char array: " + s3);
    }
}
