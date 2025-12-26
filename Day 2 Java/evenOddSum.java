import java.util.Scanner;

public class evenOddSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int n = scan.nextInt();
        
        int evenSum = 0;
        int oddSum = 0;
        
        System.out.print("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        
        System.out.println("Sum of Even = " + evenSum);
        System.out.println("Sum of Odd = " + oddSum);
    }
}