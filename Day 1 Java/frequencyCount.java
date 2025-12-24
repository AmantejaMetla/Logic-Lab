import java.util.Scanner;

public class frequencyCount {
    public static void main(String[] args) {
        String input = "bab!!";
        int[] counts = new int[26];
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                counts[c - 'a']++;
            }
        }
        
        for (int i = 0; i < 26; i++) {
            if (counts[i] > 0) {
                System.out.print((char)('a' + i) + ":" + counts[i] + ", ");
            }
        }
    }
}