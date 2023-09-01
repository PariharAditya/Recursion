package TenDays;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        generator(result, "", "abc");
        System.out.println(result);

    }

    static List<String> generator(List<String> ans, String newString, String original) {
        if (original.isEmpty()) {
            ans.add(newString);
            return ans;
        }

        char c = original.charAt(0);

        for (int i = 0; i <= newString.length(); i++) {

            String first = newString.substring(0, i);
            String second = newString.substring(i, newString.length());
            generator(ans, first + c + second, original.substring(1));
        }
        return ans;
    }
}
