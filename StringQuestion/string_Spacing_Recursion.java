package StringQuestion;

import java.util.ArrayList;
import java.util.Collections;

public class string_Spacing_Recursion {
    public static void main(String[] args) {
        ArrayList<String> ans = new ArrayList<>();
        stringPermutationList(ans, "", "ab", 0);
        System.out.println(spaceString("abc"));
        System.out.println(ans);
    }

    static void stringPermutationList(ArrayList<String> result, String answer, String unprocessed, int index) {
        if (index == unprocessed.length()) {
            result.add(answer);
            return;
        }
        stringPermutationList(result, answer + unprocessed.charAt(index), unprocessed, index + 1);
        stringPermutationList(result, answer + unprocessed.charAt(index) + " ", unprocessed, index + 1);
    }

    private static ArrayList<String> spaceString(String str) {

        ArrayList<String> strs = new ArrayList<String>();

        // Check if str.length() is 1
        if (str.length() == 1) {
            strs.add(str);
            return strs;
        }

        ArrayList<String> strsTemp = spaceString(str.substring(1, str.length()));

        // Iterate over strsTemp
        for (int i = 0; i < strsTemp.size(); i++) {

            strs.add(str.charAt(0) + strsTemp.get(i));
            strs.add(str.charAt(0) + " " + strsTemp.get(i));
        }
        // Return strs
        Collections.sort(strs);
        return strs;
    }

}
