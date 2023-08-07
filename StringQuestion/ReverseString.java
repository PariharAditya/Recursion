package StringQuestion;
import java.util.Arrays;

// whenever inplace opertion use swapping method

public class ReverseString {
    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    static void reverseString(char[] s) {
        reverse(s,0,s.length-1);
    }

    static void reverse(char[] s, int start, int end) {
        if (start == end)
            return;
       
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;
       
        reverse(s, start+1, end-1);
    }
    }

