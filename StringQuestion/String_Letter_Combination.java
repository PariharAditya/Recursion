package StringQuestion;

import java.util.ArrayList;
import java.util.List;

public class String_Letter_Combination {
    private final static String[] mapping = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv","wxyz"  };

    public static void main(String[] args) {
        System.out.println(letterCombinations("23")); 
    }

    static List<String> letterCombinations(String digits) {
        List<String> output = new ArrayList<>();
        backtrack(output, "", digits, 0);
        return output;
    }

    static void backtrack(List<String> result, String answer, String digit, int index) {
        if (index == digit.length()) {
            result.add(answer);
            return;
        }

        int numericValue = digit.charAt(index) - '0';
        String letter = mapping[numericValue];

        for (char c : letter.toCharArray()) {
            backtrack(result, answer + c, digit, index + 1);
        }
    }
}
