public class ThresholdDiscount implements DiscountStrategy {
    private double threshold;
    private double discount;

    public ThresholdDiscount(double threshold, double discount) {
        this.threshold = threshold;
        this.discount = discount;
    }

    public double applyDiscount(double total, int itemCount) {
        if (total > threshold) {
            return total * (1 - discount);
        }
        return total;
    }
}