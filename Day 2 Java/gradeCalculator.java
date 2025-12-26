import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter marks of 5 subjects: ");
        int marks1 = scan.nextInt();
        int marks2 = scan.nextInt();
        int marks3 = scan.nextInt();
        int marks4 = scan.nextInt();
        int marks5 = scan.nextInt();
        
        int total = marks1 + marks2 + marks3 + marks4 + marks5;
        
        double percentage = (total / 500.0) * 100;
        
        String grade;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 75) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        System.out.println("Percentage = " + percentage);
        System.out.println("Grade = " + grade);
        
    }
}