import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private List<OrderItem> items = new ArrayList<>();
    private List<MenuItem> menu = new ArrayList<>();
    private DiscountCalculator calculator;
    private ReceiptPrinter printer;

    public OrderManager(DiscountCalculator calculator, ReceiptPrinter printer) {
        this.calculator = calculator;
        this.printer = printer;

        menu.add(new MenuItem("Coffee", 50));
        menu.add(new MenuItem("Tea", 30));
        menu.add(new MenuItem("Cake", 70));
    }

   public void addItem(String name, int quantity) {
    for (MenuItem item : menu) {
        if (item.getName().equalsIgnoreCase(name)) {
            items.add(new OrderItem(item.getName(), quantity, item.getPrice()));
            return;
        }
    }
}

    public void checkout() {
        double total = calculator.calculateTotal(items);
        printer.print(items, total);
    }
}