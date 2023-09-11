package TenDays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Abbrivation {
    public static void main(String[] args) {
        System.out.println(findAbbr("abc"));
    }

    public static ArrayList<String> findAbbr(String str) {
        // Write your code here.
        ArrayList<String> ans = new ArrayList<>();
        backtrack(ans, str, 0, 0, new StringBuilder());
        Collections.sort(ans);
        return ans;
    }

    static void backtrack(List<String> result, String given, int start, int count, StringBuilder current) {
        int len = current.length();
        if (start == given.length()) {
            if (count > 0) {
                current.append(count);
            }
            result.add(current.toString());
        } else {
            backtrack(result, given, start + 1, count + 1, current);

            if (count > 0) {
                current.append(count);
            }
            current.append(given.charAt(start));
            backtrack(result, given, start + 1, 0, current);
        }
        current.setLength(len);
    }
}
