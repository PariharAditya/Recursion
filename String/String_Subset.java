package String;
import java.util.ArrayList;

public class String_Subset {
    public static void main(String[] args) {
        subsetGenerator("", "abc");

        System.out.println(subsetArrayList("", "abc"));
        System.out.println(stringCount("abc"));
    }

    static void subsetGenerator(String answer, String str) {

        if (str.isEmpty()) {
            System.out.println(answer);
            return;
        }

        char c = str.charAt(0);

        subsetGenerator(answer + c, str.substring(1));
        subsetGenerator(answer, str.substring(1));
    }

    static ArrayList<String> subsetArrayList(String answer, String str) {
        if (str.isEmpty()) {
            ArrayList<String> anyname = new ArrayList<>();
            anyname.add(answer);
            return anyname;
        }

        char c = str.charAt(0);

        ArrayList<String> left = subsetArrayList(answer, str.substring(1));
        ArrayList<String> finalAns = subsetArrayList(answer + c, str.substring(1));

        finalAns.addAll(left);

        return finalAns;
    }

    static int stringCount(String str)
    {
        if (str.isEmpty()) {
            return 0;
        }

        return stringCount(str.substring(1))+1;
    }
}
