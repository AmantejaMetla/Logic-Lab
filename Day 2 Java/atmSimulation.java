import java.util.Scanner;

public class atmSimulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int balance = 1000;
        
        while (true) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            
            int choice = scan.nextInt();
            
            if (choice == 1) {
                System.out.println("Balance: " + balance);
            } 
            else if (choice == 2) {
                System.out.print("Enter amount: ");
                int amount = scan.nextInt();
                balance += amount;
                System.out.println("New Balance: " + balance);
            } 
            else if (choice == 3) {
                System.out.print("Enter amount: ");
                int amount = scan.nextInt();
                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("New Balance: " + balance);
                } else {
                    System.out.println("Insufficient balance!");
                }
            } 
            else if (choice == 4) {
                System.out.println("Thank you!");
                break;
            } 
            else {
                System.out.println("Invalid choice!");
            }
        }
    }
}