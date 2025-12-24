public class reverseLetters {
    public static void main(String[] args) {
        String input = "a,b$c";
        char[] arr = input.toCharArray();
        
        String letters = "";
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (c >= 'a' && c <= 'z') {  
                letters = letters + c;   
            }
        }
        
        
        String reversedLetters = "";
        for (int i = letters.length() - 1; i >= 0; i--) {
            reversedLetters += letters.charAt(i);
        }
        
        int letterIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {  
                arr[i] = reversedLetters.charAt(letterIndex);
                letterIndex++;
            }
        }
        
        
        System.out.println(new String(arr));
    }
}