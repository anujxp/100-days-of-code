
public class RealWorld_StringBuilderPerformance {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("Java");
        }

        long end = System.currentTimeMillis();
        System.out.println("Time taken using StringBuilder: " + (end - start) + "ms");
    }
}
