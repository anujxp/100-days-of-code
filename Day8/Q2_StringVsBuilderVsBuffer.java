

public class Q2_StringVsBuilderVsBuffer {
    public static void main(String[] args) {
        String s = "Hello";
        s = s + " World"; // Creates new object
        System.out.println("String: " + s);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb);

        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println("StringBuffer: " + sbf);
    }
}
