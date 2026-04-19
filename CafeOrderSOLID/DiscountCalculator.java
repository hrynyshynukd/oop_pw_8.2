import java.util.List;

public class DiscountCalculator {
    private DiscountStrategy strategy;

    public DiscountCalculator(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateTotal(List<OrderItem> items) {
        double total = items.stream().mapToDouble(OrderItem::getTotal).sum();
        int count = items.stream().mapToInt(OrderItem::getQuantity).sum();
        return strategy.applyDiscount(total, count);
    }
}