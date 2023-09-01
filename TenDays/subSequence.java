package TenDays;

import java.util.ArrayList;
import java.util.List;

public class subSequence {
    public static void main(String[] args) {
        System.out.println(subsequence("abc"));
    }

    static ArrayList<String> subsequence(String str) {
        List<String> ans = new ArrayList<>();
        generator(ans, "", str);

        return (ArrayList<String>) ans;
    }

    static void generator(List<String> temp, String ans, String str) {
        if (str.isEmpty()) {
            temp.add(ans);
            return;
        }
        char c = str.charAt(0);
        generator(temp, ans + c, str.substring(1));
        generator(temp, ans, str.substring(1));
    }
}
