public class OrderItem {
    private String name;
    private int quantity;
    private double price;

    public OrderItem(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public double getTotal() {
        return price * quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }
}