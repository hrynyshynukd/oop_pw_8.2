import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekendDiscount implements DiscountStrategy {
    public double applyDiscount(double total, int itemCount) {
        DayOfWeek day = LocalDate.now().getDayOfWeek();
        if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
            return total * 0.85;
        }
        return total;
    }
}