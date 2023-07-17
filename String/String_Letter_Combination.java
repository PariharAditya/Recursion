package String;
import java.util.ArrayList;
import java.util.List;

public class String_Letter_Combination {
    public static void main(String[] args) {
        System.out.println(fxn("", "2"));
        System.out.print(letterCombinations("12"));
    }

    static List<String> letterCombinations(String digits) {
        String answer = "";        
        return fxn(answer, digits);
    }

    private static List<String> fxn(String answer, String str) {
        if (str.isEmpty()) {
            ArrayList<String> s = new ArrayList<>();
            s.add(answer);
            return s;
        }

        int numericValue = str.charAt(0)-'0';

        ArrayList<String> finalAnswer = new ArrayList<>();
        for (int i = (numericValue-1)*3; i < numericValue*3; i++) {
            char c = (char) ('a' + i);
            finalAnswer.addAll(fxn(answer+c, str.substring(1)));
        }
        return finalAnswer;
    }
}
