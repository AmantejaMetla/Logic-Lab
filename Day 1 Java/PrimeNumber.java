import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Integer num = 17 ;
        
        if (num <= 1) {
            System.out.println(num + " is not a Prime number");
            return;  
        }
        
       
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(num + " is not a Prime number");
                return;  
            }
        }
        
        
        System.out.println(num + " is a Prime number");
    }
}