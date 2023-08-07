package StringQuestion;

public class RemoveDuplication {
    public static void main(String[] args) {
        // System.out.println(subsetGenerator("aaaaabbbbb"));

        subsetGenerator("", "aaaaabbbbb");
    }

    static String subsetGenerator(String str) {

        if (str.length() <= 1) {
            return str;
        }

        if (str.charAt(0) == str.charAt(1)) {
            return subsetGenerator(str.substring(1));
        } else {

            return str.charAt(0) + subsetGenerator(str.substring(1));
        }
    }

    static void subsetGenerator(String answer, String str) {

        if (str.isEmpty()) {
            System.out.println(answer);
            return;
        }

        char c = str.charAt(0);

        if (c == str.charAt(1)) {
            subsetGenerator(answer, str.substring(1));
        }

        subsetGenerator(answer+c, str.substring(1));

    }
}
