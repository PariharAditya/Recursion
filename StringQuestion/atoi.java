package StringQuestion;

public class atoi {

    public static void main(String[] args) {
        System.out.println(myAtoi(" -42"));
    }

    static int myAtoi(String s) {
        s = s.trim();
        int num = 0;
        boolean isNegative = false;
        
        if (!s.isEmpty() && (s.charAt(0) == '-' || s.charAt(0) == '+')) {
            isNegative = s.charAt(0) == '-';
            s = s.substring(1);
        }

        num = helper(s, num, isNegative);

        return num;
    }

    static int helper(String d, int num, boolean isNegative) {
        if (d.isEmpty()) {
            return isNegative ? -num: num;
        }

        char ch = d.charAt(0);
        if (Character.isDigit(ch)) {
            num = num*10 + ch - '0';
        } else {
            return isNegative ? -num: num;
        }

        return helper(d.substring(1), num, isNegative);
    }
    static int atoiLoop(String d) {
        d = d.trim();
        if (d.isEmpty()) {
            return 0;
        }
        
        int num = 0;
        boolean isNegative = false;
        int index = 0;

        if (d.charAt(0) == '-' || d.charAt(0) == '+') {
            isNegative = d.charAt(0) == '-';
            index++;
        }

        while (index<d.length() && Character.isDigit(d.charAt(index))) {
            int digit = d.charAt(index) - '0';
            // Check for overflow before updating num
            if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && digit > 7)) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            num = num * 10 + digit;
            index++;
        }
        return isNegative ? -num:num;
    }
}