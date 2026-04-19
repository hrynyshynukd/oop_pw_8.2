public class NoDiscount implements DiscountStrategy {
    public double applyDiscount(double total, int itemCount) {
        return total;
    }
}