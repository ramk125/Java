import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        
        char choice;
        System.out.println("Select your choice");
        System.out.println("M -> Madras");
        System.out.println("B -> Bombay");
        System.out.println("C -> Calcutta");
        System.out.println("Choice - - - ");
        System.out.flush();

        try
        {
 
            switch (choice = (char) System.in.read()) {
                case 'M':
                    case 'm':
                    System.out.println("Madras : Blocket 5");
                    break;
                case 'B':
                case 'b':
                    System.out.println("Bombay : Bloket 9");

                 case 'C':
                 case 'c':
                 System.out.println("Calcutta : Blocket 15");   
                default:
                System.out.println("Invalid Choice (IC)");
                    break;
            }
        }
        catch(Exception e)
        {
            System.out.println("I/O Error");
        }
    }
    
}
