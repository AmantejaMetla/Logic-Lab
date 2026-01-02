class AccountNumber {
    private final String digits;
    
    public static boolean isValid(String s) {
        if (s.length() != 12) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
    
    public AccountNumber(String s) {
        if (isValid(s)) {
            this.digits = s;
        } else {
            this.digits = "000000000000";
            System.out.println("Invalid account number");
        }
    }
    
    public String getDigits() {
        return digits;
    }
}

class Main14 {
    public static void main(String[] args) {
        AccountNumber a = new AccountNumber("123456789012");
        AccountNumber b = new AccountNumber("ABC");
    }
}