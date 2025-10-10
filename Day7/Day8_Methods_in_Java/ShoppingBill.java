package Question;

// Real-Life Problem Example using Methods
// Example: Calculating Bill for Shopping Items

public class ShoppingBill {
    // Method to calculate total price
    static double calculateTotal(double[] prices) {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    // Method to apply discount
    static double applyDiscount(double total, double discountPercent) {
        return total - (total * discountPercent / 100);
    }

    public static void main(String[] args) {
        double[] prices = {250.50, 99.99, 149.75, 199.00};
        double total = calculateTotal(prices);
        System.out.println("Total Bill before Discount: ₹" + total);
        
        double finalBill = applyDiscount(total, 10); // 10% discount
        System.out.println("Final Bill after Discount: ₹" + finalBill);
    }
}
