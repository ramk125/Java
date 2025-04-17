import java.util.Date;

public class SystemData {
    public static void main(String[] args) {
        Date date = new Date();
        long timeInMillis = date.getTime(); // Returns time in milliseconds since Jan 1, 1970
        System.out.println("Time in Milliseconds: " + timeInMillis);
        System.out.println(date);
       }
}                