import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date(date1.getTime() + 5000); // 5 seconds later

        System.out.println("date1 before date2? " + date1.before(date2)); // true
        System.out.println("date1 after date2? " + date1.after(date2)); // false
        System.out.println("date1 equals date2? " + date1.equals(date2)); // false
    }
}