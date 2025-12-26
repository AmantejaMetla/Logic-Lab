import java.util.Scanner;

public class reverseWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = scan.nextLine();
        
        String[] words = sentence.split(" ");
        String result = "";
        
        for (int i = 0; i < words.length; i++) {
            String reversed = "";
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reversed += words[i].charAt(j);
            }
            result += reversed + " ";
        }
        
        System.out.println(result);
 
    }
}