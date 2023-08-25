package StringQuestion;

public class ParsingString {
    public static void main(String[] args) {
        System.out.println(parseBoolExpr("&(|(f))"));

    }

    static boolean parseBoolExpr(String expression) {
        if (expression.equals("t")) {
            return true;
        } else if (expression.equals("f")) {
            return false;
        } else if (expression.startsWith("!")) {
            return !parseBoolExpr(expression.substring(2, expression.length() - 1));
        } else if (expression.startsWith("&")) {
            int count = 0, index = 2;
            for (int i = 2; i < expression.length(); i++) {
                char c = expression.charAt(i);
                if (c == '(') {
                    count++;
                } else if (c == ')') {
                    count--;
                } else if (c == ',' && count == 0) {
                    index = i;
                    break;
                }
            }
            String left = expression.substring(2, index);
            String right = expression.substring(index + 1, expression.length() - 1);
            return parseBoolExpr(left) && parseBoolExpr(right);
        } else if (expression.startsWith("|")) {
            int count = 0, index = 2;
            for (int i = 2; i < expression.length(); i++) {
                char c = expression.charAt(i);
                if (c == '(') {
                    count++;
                } else if (c == ')') {
                    count--;
                } else if (c == ',' && count == 0) {
                    index = i;
                    break;
                }
            }
            String left = expression.substring(2, index);
            String right = expression.substring(index + 1, expression.length() - 1);
            return parseBoolExpr(left) || parseBoolExpr(right);
        }
        return false;
    }
}
