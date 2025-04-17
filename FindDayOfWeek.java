import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.util.Scanner;

public class FindDayOfWeek {

    public static void main(String[] args) {
        // Scanner to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Input date format
        System.out.print("Enter date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();
        
        try {
            // Define the date format
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            
            // Parse the input date
            LocalDate date = LocalDate.parse(inputDate, formatter);
            
            // Get the day of the week from the LocalDate object
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            
            // Print the day of the week
            System.out.println("The day of the week for " + inputDate + " is: " + dayOfWeek);
            
        } catch (Exception e) {
            // Handle invalid date format
            System.out.println("Invalid date format. Please enter the date in yyyy-MM-dd format.");
        }
        
        scanner.close();
    }
}
