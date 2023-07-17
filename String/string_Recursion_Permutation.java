package String;
import java.util.ArrayList;

public class string_Recursion_Permutation {
    public static void main(String[] args) {
        ArrayList<String> foo = stringPermutationList("", "abc");
        System.out.println(foo);

        stringPermutation("", "abc");

        System.out.println(stringPermutation_Count("", "abc"));
    }

    static int stringPermutation_Count(String answer, String unprocessed) {

        // Base condition
        if (unprocessed.isEmpty()) {
            return 1;
        }
        char c = unprocessed.charAt(0);
        int count = 0;

        for (int i = 0; i <= answer.length(); i++) {

            String first = answer.substring(0, i);
            String second = answer.substring(i, answer.length());

            count += stringPermutation_Count(first + c + second, unprocessed.substring(1));
        }
        return count;
    }

    static void stringPermutation(String answer, String unprocessed) {

        // Base condition
        if (unprocessed.isEmpty()) {
            System.out.println(answer);
            return;
        }

        char c = unprocessed.charAt(0);

        // For doing abc to bac, bca same for every letter we've to Iterate every
        // element
        for (int i = 0; i <= answer.length(); i++) {

            String first = answer.substring(0, i);
            String second = answer.substring(i, answer.length());

            stringPermutation(first + c + second, unprocessed.substring(1));
        }

    }

    static ArrayList<String> stringPermutationList(String answer, String unprocessed) {

        // Base condition
        if (unprocessed.isEmpty()) {
            ArrayList<String> p = new ArrayList<>();
            p.add(answer);
            return p;
        }

        ArrayList<String> answerList = new ArrayList<>();

        char c = unprocessed.charAt(0);
        // For doing abc to bac, bca same for every letter we've to Iterate every
        // element
        for (int i = 0; i <= answer.length(); i++) {

            String first = answer.substring(0, i);
            String second = answer.substring(i, answer.length());

            answerList.addAll(stringPermutationList(first + c + second, unprocessed.substring(1)));
        }
        return answerList;
    }
}
