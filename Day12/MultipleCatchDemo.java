// MultipleCatchDemo.java
// Demonstrates handling different exception types with multiple catch blocks
// Compile: javac MultipleCatchDemo.java
// Run:     java MultipleCatchDemo

class MultipleCatchDemo {
    public static void main(String[] args) {
        System.out.println("=== Multiple Catch Demo ===");

        String[] arr = { "10", "abc", null };

        for (int i = 0; i < arr.length; i++) {
            try {
                System.out.println("Parsing element: " + arr[i]);
                // potential NullPointerException or NumberFormatException
                int val = Integer.parseInt(arr[i]); 
                System.out.println("Parsed: " + val);
            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: invalid number format -> " + e.getMessage());
            } catch (NullPointerException e) {
                System.out.println("NullPointerException: encountered null input.");
            } catch (Exception e) {
                System.out.println("Other exception: " + e.getClass().getSimpleName());
            }
        }

        System.out.println("Loop complete.");
    }
}
