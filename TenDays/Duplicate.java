package TenDays;

public class Duplicate {
    public static void main(String[] args) {
        System.out.println(removeDuplicate("aaabc"));          
    }
    static String removeDuplicate(String original) {
        if (original.length() <= 1) {
            return original;
        }
        char c = original.charAt(0);

        if (c != original.charAt(1)) {
            return c + removeDuplicate(original.substring(1));
        } else {
            return removeDuplicate(original.substring(1));
        }
    }
}
