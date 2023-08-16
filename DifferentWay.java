import java.util.ArrayList;
import java.util.List;

public class DifferentWay {
    public static void main(String[] args) {

    }

    static List<Integer> diffWaysToCompute(String expression) {
        List<Integer> ans = new ArrayList<>();

        if (isNumber(expression)) {
            ans.add(Integer.parseInt(expression));
            return ans;
        }

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (c == '+' || c == '-' || c == '*') {
                List<Integer> leftResult = diffWaysToCompute(expression.substring(0, i));
                List<Integer> rightResult = diffWaysToCompute(expression.substring(i + 1));

                for (int left : leftResult) {
                    for (int right : rightResult) {
                        int result = 0;
                        switch (c) {
                            case '+':
                                result = left + right;
                                break;

                            case '-':
                                result = left - right;
                                break;

                            case '*':
                                result = left * right;
                                break;
                        }
                        ans.add(result);
                    }
                }
            }
        }
        return ans;

    }

    private static boolean isNumber(String expression) {
        for (char c : expression.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
