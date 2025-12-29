public class MathUtil {
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int clamp(int v, int min, int max) {
        if (v < min) {
          return min;
        }
        if (v > max) {
          return max;
        }
        return v;
    }

    public static void main(String[] args) {
        System.out.println(max(7, 3));
        System.out.println(clamp(15, 0, 10));
        System.out.println(clamp(-3, -2, 5));
    }
}
