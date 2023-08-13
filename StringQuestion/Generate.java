package StringQuestion;

import java.util.ArrayList;
import java.util.List;

public class Generate {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));

    }

    static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        combination(ans, 0, 0, "", n);
        return ans;
    }

    static void combination(List<String> result, int left, int right, String ans, int n) {
        if (ans.length() == 2 * n) {
            result.add(ans);
            return;
        }

        if (left < n) {
            combination(result, left + 1, right, ans + '(', n);
        }

        if (right < left) {
            combination(result, left, right + 1, ans + ')', n);
        }

    }

}