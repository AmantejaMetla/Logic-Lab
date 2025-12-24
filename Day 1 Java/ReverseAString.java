import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      String s = "Mumbai";
      String reversed = "";
      
      for (int i = s.length() -1 ; i >= 0 ; i --){
        reversed += s.charAt(i);
      }
      System.out.println(reversed);
  }
}