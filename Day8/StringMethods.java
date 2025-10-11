

public class StringMethods {
    public static void main(String[] args) {
        String text = "Hello Java Programming";

        System.out.println("Char at 6: " + text.charAt(6));
        System.out.println("Substring: " + text.substring(6, 10));
        System.out.println("Contains 'Java': " + text.contains("Java"));
        System.out.println("Replace 'Java' with 'World': " + text.replace("Java", "World"));
        System.out.println("Split by space: ");
        for (String part : text.split(" ")) {
            System.out.println(part);
        }
    }
}
