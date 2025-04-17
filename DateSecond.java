import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the user's date of birth
        System.out.print("Enter your birth year (YYYY): ");
        int year = scanner.nextInt();
        
        System.out.print("Enter your birth month (MM): ");
        int month = scanner.nextInt();
        
        System.out.print("Enter your birth day (DD): ");
        int day = scanner.nextInt();
        
        // Get current date
        LocalDate today = LocalDate.now();
        
        // Convert input to LocalDate
        LocalDate birthDate = LocalDate.of(year, month, day);
        
        // Calculate age
        Period age = Period.between(birthDate, today);
        
        // Display age
        System.out.println("You are " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days old.");
        
        scanner.close();
    }
}