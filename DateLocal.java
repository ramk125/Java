import java.time.LocalDate;

public class DateLocal {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, 4, 3);

        System.out.println("Year: " + date.getYear());
        System.out.println("Month: " + date.getMonth()); // APRIL
        System.out.println("Month Number: " + date.getMonthValue()); // 4
        System.out.println("Day: " + date.getDayOfMonth());
        System.out.println("Day of Week: " + date.getDayOfWeek()); // THURSDAY
        System.out.println("Day of Year: " + date.getDayOfYear());
    }
}