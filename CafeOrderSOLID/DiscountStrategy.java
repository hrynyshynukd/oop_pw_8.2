public interface DiscountStrategy {
    double applyDiscount(double total, int itemCount);
}