import java.util.*;

public class ExpressionEvaluator {
    public static int evaluate(String s) {
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<Character> ops = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == ' ') {
                i++;
                continue;
            }
            if (Character.isDigit(s.charAt(i))) {
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                nums.add(num);
                continue;
            }
            ops.add(s.charAt(i));
            i++;
        }
        for (int j = 0; j < ops.size(); j++) {
            if (ops.get(j) == '*' || ops.get(j) == '/') {
                int a = nums.get(j);
                int b = nums.get(j + 1);
                int r = ops.get(j) == '*' ? a * b : a / b;
                nums.set(j, r);
                nums.remove(j + 1);
                ops.remove(j);
                j--;
            }
        }
        int res = nums.get(0);
        for (int j = 0; j < ops.size(); j++) {
            if (ops.get(j) == '+') res += nums.get(j + 1);
            else res -= nums.get(j + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Result: " + evaluate(s));
    }
}
