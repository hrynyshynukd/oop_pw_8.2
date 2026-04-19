import java.util.List;

public class ConsoleReceiptPrinter implements ReceiptPrinter {
    public void print(List<OrderItem> items, double total) {
        System.out.println("=== RECEIPT ===");
        for (OrderItem item : items) {
            System.out.println(item.getName() + " x" + item.getQuantity());
        }
        System.out.println("Total: " + total);
    }
}