import java.util.Scanner;

public class wordFrequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = scan.nextLine();
        
        String[] words = sentence.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("")){
              continue;
            }
            
            int count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "";
                }
            }
            System.out.println(words[i] + ": " + count);
        }
    }
}