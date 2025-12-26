import java.util.Scanner;

public class trianglePattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter height of triangle: ");
        int height = scan.nextInt();
        
        printPattern(height);
        
        scan.close();
    }
    
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            printStars(i);
            System.out.println();
        }
    }
    
    public static void printStars(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print("* ");
        }
    }
}