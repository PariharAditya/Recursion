package String;
public class UpperCaseCheck {
    public static void main(String[] args) {
        System.out.println(check("SDEadityasinghParihar"));
    }

    static char check(String str) {
        if (str.isEmpty()) {
            return ' ';
        }

        if (Character.isUpperCase(str.charAt(0))) {
            return str.charAt(0);
        }

        return check(str.substring(1));
    }
}
