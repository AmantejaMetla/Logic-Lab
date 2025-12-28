import java.util.*;

public class Gradebook {
    static String[] names;
    static int[] grades;
    static int n;

    static void printAll() {
        for (int i = 0; i < n; i++)
            System.out.print(names[i] + "(" + grades[i] + ")");
        System.out.println();
    }

    static void topper() {
        int index = 0;
        for (int i = 1; i < n; i++)
            if (grades[i] > grades[index]) idx = i;
        System.out.println("Topper: " + names[index] + "(" + grades[index] + ")");
    }

    static void average() {
        double sum = 0;
        for (int g : grades) sum += g;
        System.out.printf("Average: %.2f%n", sum / n);
    }

    static void search(String s) {
        for (int i = 0; i < n; i++)
            if (names[i].equals(s))
                System.out.println("Found: " + names[i] + "(" + grades[i] + ")");
    }

    static void curve() {
        for (int i = 0; i < n; i++)
            grades[i] = Math.min(100, grades[i] + 5);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        names = new String[n];
        grades = new int[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
            grades[i] = sc.nextInt();
            sc.nextLine();
        }
        while (true) {
            int c = sc.nextInt();
            sc.nextLine();
            if (c == 1) printAll();
            else if (c == 2) topper();
            else if (c == 3) average();
            else if (c == 4) search(sc.nextLine());
            else if (c == 5) curve();
            else break;
        }
    }
}
