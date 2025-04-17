import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Taking input for sides of the triangle
            System.out.print("Enter side a: ");
            double a = scanner.nextDouble();
            
            System.out.print("Enter side b: ");
            double b = scanner.nextDouble();
            
            System.out.print("Enter side c: ");
            double c = scanner.nextDouble();
            
            // Check for valid triangle condition
            if (a + b > c && a + c > b && b + c > a) {
                // Calculate semi-perimeter
                double s = (a + b + c) / 2;
                
                // Calculate area using Heron's formula
                double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                
                System.out.println("The area of the triangle is: " + area);
            } else {
                System.out.println("Error: The given sides do not form a valid triangle.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numerical values.");
        } finally {
            scanner.close();
        }
    }
}
