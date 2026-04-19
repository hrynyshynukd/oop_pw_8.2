import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileReceiptPrinter implements ReceiptPrinter {
    public void print(List<OrderItem> items, double total) {
        try (FileWriter writer = new FileWriter("receipt.txt")) {
            writer.write("=== RECEIPT ===\n");
            for (OrderItem item : items) {
                writer.write(item.getName() + " x" + item.getQuantity() + "\n");
            }
            writer.write("Total: " + total);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}