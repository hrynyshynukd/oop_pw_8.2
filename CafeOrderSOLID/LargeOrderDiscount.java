public class LargeOrderDiscount implements DiscountStrategy {
    private int minItems;

    public LargeOrderDiscount(int minItems) {
        this.minItems = minItems;
    }

    public double applyDiscount(double total, int itemCount) {
        if (itemCount >= minItems) {
            return total * 0.9;
        }
        return total;
    }
}