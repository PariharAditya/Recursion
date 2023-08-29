package TenDays;

import java.util.ArrayList;
import java.util.List;

public class BinaryString {
    public static void main(String[] args) {
        System.out.println(generateString(4));
    }

    static List<String> generateString(int N) {
        List<String> result = new ArrayList<>();
        generator(N, 0, "", result);

        return result;
    }

    static void generator(int N, int k, String binaryString, List<String> ans) {
        if (k == N) {
            ans.add(binaryString);
            return;
        }

        generator(N, k + 1, binaryString + "0", ans);

        if (binaryString.isEmpty() || binaryString.charAt(binaryString.length() - 1) != '1') {
            generator(N, k + 1, binaryString + "1", ans);
        }

    }
}
// 0000 0001 0010 0100 0101 1000 1001 1010