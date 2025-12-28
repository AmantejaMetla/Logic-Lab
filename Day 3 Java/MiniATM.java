import java.util.*;

public class MiniATM {
    static double balance = 0;
    static int pin = 1234;

    static void deposit(double a) { if (a > 0) balance += a; }
    static void withdraw(double a) { if (a > 0 && a <= balance) balance -= a; }
    static void printBalance() { System.out.printf("Balance: %.2f%n", balance); }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int c = sc.nextInt();
            if (c == 1) deposit(sc.nextDouble());
            else if (c == 2) {
                if (sc.nextInt() == pin) withdraw(sc.nextDouble());
            }
            else if (c == 3) printBalance();
            else if (c == 4) {
                if (sc.nextInt() == pin) pin = sc.nextInt();
            }
            else break;
        }
    }
}
