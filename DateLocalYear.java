import java.time.LocalDate;

public class DateLocalYear {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 2, 29);
        System.out.println("Is Leap Year? " + date.isLeapYear());
    }
}