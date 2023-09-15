package StringQuestion;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
    public static void main(String[] args) {
        System.out.println(letterCase("a1b2"));
    }
    static List<String> letterCase(String s) {
        List<String> ans = new ArrayList<>();
        generator(ans, s, "", 0);
        return ans;
    }
    
    static void generator(List<String> result, String s, String answer, int index) {
        if (index == s.length()) {
            result.add(answer);
            return;
        }
        if (Character.isLetter(s.charAt(index))) {
            generator(result, s, answer+Character.toUpperCase(s.charAt(index)), index+1);
            generator(result, s, answer+Character.toLowerCase(s.charAt(index)), index+1);
        } else {
            generator(result, s, answer+s.charAt(index), index+1);
        }        
    }
}
