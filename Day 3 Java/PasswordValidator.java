import java.util.*;

public class PasswordValidator {
    static boolean isValid(String p, String u) {
        boolean up=false, lo=false, di=false, sp=false;
        if (p.length() < 8 || p.length() > 20) return false;
        if (p.toLowerCase().contains(u.toLowerCase())) return false;
        for (char c : p.toCharArray()) {
            if (Character.isUpperCase(c)) up=true;
            else if (Character.isLowerCase(c)) lo=true;
            else if (Character.isDigit(c)) di=true;
            else if ("!@#$%^&*".indexOf(c)>=0) sp=true;
            else if (c==' ') return false;
        }
        return up && lo && di && sp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        String pwd = sc.nextLine();
        System.out.println(isValid(pwd,user) ? "Valid" : "Invalid");
    }
}
