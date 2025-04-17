import java.time.LocalDate;
import java.time.Period;

public class DateTimeDifference {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2000, 5, 10);
        LocalDate today = LocalDate.now();

        Period age = Period.between(birthDate, today);
        System.out.println("Age: " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + " days.");
    }
}