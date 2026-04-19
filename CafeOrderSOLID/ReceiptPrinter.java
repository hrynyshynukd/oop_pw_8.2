import java.util.List;

public interface ReceiptPrinter {
    void print(List<OrderItem> items, double total);
}