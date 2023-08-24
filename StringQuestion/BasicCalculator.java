package StringQuestion;

public class BasicCalculator {
    // static int index;
    public static void main(String[] args) {
        System.out.println(calc("1 + 1"));
        
    }
    // static int calculate(String s) {
        // index = 0;
        // return calc(s);
    // }
    static int calc(String s) {
        int index = 0;
        int result = 0, num = 0, sign = 1;

        while(index < s.length()) {
            char c = s.charAt(index++);
            if (c >= '0' && c <= '9') {
                num = num * 10 + c - '0';
            }
            else if (c == '(') {
                num = calc(s);
            }
            else if (c == ')') {
                return result + sign*num;
            }
            else if(c == '+' || c == '-') {
                result += sign*num;
                num = 0;
                sign = c == '-' ? -1:1;
            }
        }
        return result+sign*num;
    }
}
