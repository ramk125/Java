import java.time.LocalDate;

public class DateLocalManuplation {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, 4, 3);

        LocalDate nextWeek = date.plusWeeks(1);
        LocalDate previousMonth = date.minusMonths(1);
        LocalDate nextYear = date.plusYears(1);

        System.out.println("Original Date: " + date);
        System.out.println("Next Week: " + nextWeek);
        System.out.println("Previous Month: " + previousMonth);
        System.out.println("Next Year: " + nextYear);
    }
}