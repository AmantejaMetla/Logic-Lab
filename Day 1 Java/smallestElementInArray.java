import java.util.*;

public class smallestElementInArray {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      int[] arr = {10, -3, 25, 7, 0};
      int smallest = arr[0];
      
      for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
      System.out.println("Smallest value: " + smallest);
  }
}