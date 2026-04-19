public class Main {
    public static void main(String[] args) {

        DiscountStrategy discount = new WeekendDiscount();
        DiscountCalculator calculator = new DiscountCalculator(discount);

        ReceiptPrinter printer = new ConsoleReceiptPrinter();

        OrderManager order = new OrderManager(calculator, printer);

        order.addItem("Coffee", 2);
        order.addItem("Cake", 1);
        order.addItem("Tea", 2);

        order.checkout();
    }
}