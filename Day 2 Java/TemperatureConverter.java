import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter choice CtoF or FtoC: ");
        String choice = scan.next();
        
        System.out.print("Enter temperature value: ");
        double temperature = scan.nextDouble();
        
        double result;
        
        if (choice.equals("CtoF")) {  
            // Celsius to Fahrenheit: (C × 9/5) + 32
            result = (temperature * 9/5) + 32;
            System.out.println("Fahrenheit = " + result);
        } 
        else if (choice.equals("FtoC")) {  
            // Fahrenheit to Celsius: (F - 32) × 5/9
            result = (temperature - 32) * 5/9;
            System.out.println("Celsius = " + result);
        } 
        else {
            System.out.println("Invalid choice! Please enter 'CtoF' or 'FtoC'.");
        }
        
    }
}