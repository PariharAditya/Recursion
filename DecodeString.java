
import java.util.Collections;

public class DecodeString {

    public static void main(String[] args) {
        System.out.println(decodeStr("3[a]2[bc]"));
    }

    static String decodeStr(String s) {
        return decode(s, 0)[0];
    }

    static String[] decode(String s, int index) {
        StringBuilder result = new StringBuilder();
        int num = 0;

        while (index < s.length()) {
            char c = s.charAt(index);

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
                index++;
            } else if (c == '[') {
                String[] decoded = decode(s, index + 1);
                result.append(String.join("", Collections.nCopies(num, decoded[0])));
                num = 0;
                index = Integer.parseInt(decoded[1]) + 1;
            } else if (c == ']') {
                return new String[] { result.toString(), String.valueOf(index) };
            } else {
                result.append(c);
                index++;
            }

        }
        return new String[] { result.toString(), String.valueOf(index) };

    }

}