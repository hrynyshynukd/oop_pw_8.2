public class FirstOrderDiscount implements DiscountStrategy {
    private boolean first;

    public FirstOrderDiscount(boolean first) {
        this.first = first;
    }

    public double applyDiscount(double total, int itemCount) {
        if (first) {
            return total * 0.8;
        }
        return total;
    }
}