
public class RealWorld_StringReversal {
    public static void main(String[] args) {
        String input = "Learning Java";
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed: " + reversed);
    }
}
